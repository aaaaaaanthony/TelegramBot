package org.example.client;

import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONException;
import cn.hutool.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.example.methods.Config;
import org.example.methods.Methods;

import java.io.IOException;
import java.lang.reflect.Method;

public class TelegramBot extends Config implements Runnable{

    @Override
    public void run() {
        try {
            long offset = 0; // 起始的更新 ID

            while (true) {
                String url = "https://api.telegram.org/bot" + BOT_TOKEN + "/getUpdates?offset=" + offset;
                Console.log(url);
                HttpGet request = new HttpGet(url);

                try (CloseableHttpClient httpClient = HttpClients.createDefault();
                     CloseableHttpResponse response = httpClient.execute(request)) {

                    HttpEntity entity = response.getEntity();
                    if (entity != null) {
                        String responseBody = EntityUtils.toString(entity);

                        // 处理返回的更新数据
                        // 在这里编写你的处理逻辑，解析并处理接收到的更新数据
                        System.out.println(responseBody);

                        // 更新offset值为下一批更新的起始ID
                        // 可以根据需要进行不同的处理方式，例如保存最后一条更新的ID或计算出下一个offset值
                        offset = calculateNextOffset(responseBody);

//                        Methods.sendMessage("收到");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long calculateNextOffset(String responseBody) {
        long nextOffset = 0;

        try {
            JSONObject responseJson = new JSONObject(responseBody);
            JSONArray resultArray = responseJson.getJSONArray("result");

            if (resultArray.size() > 0) {
                JSONObject lastUpdate = resultArray.getJSONObject(resultArray.size() - 1);
                nextOffset = lastUpdate.getLong("update_id") + 1;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return nextOffset;
    }

}

