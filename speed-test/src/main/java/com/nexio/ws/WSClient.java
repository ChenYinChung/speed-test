package com.nexio.ws;

import com.neovisionaries.ws.client.WebSocket;
import com.neovisionaries.ws.client.WebSocketAdapter;
import com.neovisionaries.ws.client.WebSocketExtension;
import com.neovisionaries.ws.client.WebSocketFactory;
import com.nexio.adapter.WebSocket17Adapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WSClient {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    private  final int TIMEOUT = 5000;
    private  WebSocket webSocket;

    /**
     * Connect to the server.
     */
    public  void connect(String wss , WebSocket17Adapter webSocketAdapter) throws Exception {

        WebSocketFactory webSocketFactory = new WebSocketFactory();
        webSocketFactory.setConnectionTimeout(TIMEOUT);
        webSocket = webSocketFactory.createSocket(wss);

        webSocket.addListener(webSocketAdapter);
        webSocket.addExtension(WebSocketExtension.PERMESSAGE_DEFLATE);
        webSocket.connect();

        long begin = System.currentTimeMillis()/1000;

        while(true){
            if(webSocketAdapter.isLogin()){
                break;
            }

            long end = System.currentTimeMillis()/1000;

            if(end - begin > 10){
                webSocketAdapter.setDone(true);
                throw new Exception("Login in 17ce timeout over 10 sec");
            }
        }
    }


    public  void send(String json,WebSocket17Adapter webSocketAdapter) throws Exception{
        webSocket.sendText(json);

        long begin = System.currentTimeMillis()/1000;

        while(true){
            if(webSocketAdapter.isDone()){
                break;
            }

            Thread.sleep(1000);

            long end = System.currentTimeMillis()/1000;

            if(end - begin > 60){
                webSocketAdapter.setDone(true);
                throw new Exception("Login in 17ce timeout over 60 sec fetch data");
            }

        }
    }

    public  void disconnect(){
        webSocket.disconnect();
    }
}
