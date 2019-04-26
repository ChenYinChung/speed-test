package com.nexio.service;

import com.google.gson.Gson;
import com.nexio.adapter.WebSocket17Adapter;
import com.nexio.model.checkuser.request.Api17ce;
import com.nexio.model.checkuser.request.UserCode;
import com.nexio.model.SpeedRequest;
import com.nexio.ws.WSClient;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SpeedRequestService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String CHECK_USER_URL = "https://www.17ce.com/site/checkuser";
    private static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36";
    public static final String REFERER = "https://www.17ce.com/";
    private static final String WSS = "wss://wsapi.17ce.com:8001/socket/?";

    private Optional<UserCode> checkUser(String url, String type, String isp) {
        HttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httpPost = new HttpPost(CHECK_USER_URL);
            httpPost.setHeader("Content-Type", CONTENT_TYPE);
            httpPost.setHeader("User-Agent", USER_AGENT);
            httpPost.setHeader("Referer", REFERER);
            // Request body
            ArrayList<NameValuePair> postParameters = new ArrayList<>();
            postParameters.add(new BasicNameValuePair("url", url));
            postParameters.add(new BasicNameValuePair("type", type));
            postParameters.add(new BasicNameValuePair("isp", isp));

            httpPost.setEntity(new UrlEncodedFormEntity(postParameters, "UTF-8"));
            HttpResponse response = httpclient.execute(httpPost);
            HttpEntity entity = response.getEntity();

            String temp = EntityUtils.toString(entity);
            // release connection
            EntityUtils.consume(entity);

            Gson gson = new Gson();
            Api17ce api17ce = gson.fromJson(temp, Api17ce.class);

            String code = api17ce.getData().getCode();
            String user = api17ce.getData().getUser();
            String ut = api17ce.getData().getUt();


            return Optional.of(new UserCode(user, code,ut,url,type));

        } catch (Exception e) {
            logger.error("error",e);
        }

        return Optional.empty();
    }

    private List<String> speedRequest(UserCode userCode) {

        WSClient wsClient = new WSClient();

        try {
            StringBuilder wss = new StringBuilder();
            wss.append(WSS).append("user").append("=").append(URLEncoder.encode(userCode.getUser(), "UTF-8"));
            wss.append("&code=").append(userCode.getCode()).append("&ut=").append(userCode.getUt());

            WebSocket17Adapter webSocketAdapter = new WebSocket17Adapter();

            wsClient.connect(wss.toString(),webSocketAdapter);

            SpeedRequest wsRequest = new SpeedRequest(userCode.getUrl(),userCode.getType());

            Gson gson = new Gson();
            String json = gson.toJson(wsRequest);

            wsClient.send(json,webSocketAdapter);


            return webSocketAdapter.getDatas();

        } catch (Exception e) {
            throw new RuntimeException("No Datas return from web socket",e);
        }finally {
            wsClient.disconnect();
        }

    }

    public List<String> request(String url, String type){
        Optional<UserCode> optionalUserCode = checkUser(url, type,"0");
        if (optionalUserCode.isPresent()) {
            UserCode userCode = optionalUserCode.get();
           return speedRequest(userCode);
        } else {
            logger.info("User Code is not present in {} {}",url , type);
            throw new RuntimeException(String.format("User Code is not present in {} {}",url , type));
        }
    }

    public static void main(String arg[]) {
        SpeedRequestService speedRequestService = new SpeedRequestService();
        speedRequestService.request("www.w686.net", "http");

    }


}
