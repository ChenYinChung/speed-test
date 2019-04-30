package com.nexio.adapter;

import com.google.gson.Gson;
import com.neovisionaries.ws.client.WebSocket;
import com.neovisionaries.ws.client.WebSocketAdapter;
import com.nexio.model.getresp.newdata.NewData;
import com.nexio.ws.WSClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class WebSocket17Adapter extends WebSocketAdapter {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    String LOGIN_OK = "login ok";
    String TASK_ACCEPT = "TaskAccept";
    String NEW_DATA = "NewData";
    String END_TASK = "TaskEnd";
    boolean login;
    boolean done;

    List<String> datas = new ArrayList<>();
    List<String> accept = new ArrayList<>();
    List<String> end = new ArrayList<>();

    public void onTextMessage(WebSocket websocket, String message) {
        if (message.contains(LOGIN_OK)) {
            login = true;
        } else if (message.contains(TASK_ACCEPT)) {
            logger.info("Task Accept");

        } else if (message.contains(NEW_DATA)) {
            Gson gson = new Gson();
            NewData newData = gson.fromJson(message, NewData.class);
            double totalTime = Double.parseDouble(newData.getData().getTotalTime());

            // over 2 sec
            if (totalTime >= 2) {
                logger.info("------------------- totoal time [{}] [{}]", totalTime,message);
                datas.add(message);
            }
        } else if (message.contains(END_TASK)) {
            logger.info("Task End");
            done = true;
        } else {
            done = true;
        }
    }

    public boolean isLogin() {
        return login;
    }

    public List<String> getDatas() {
        return datas;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
