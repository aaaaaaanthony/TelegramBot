package org.example;

import cn.hutool.core.lang.Console;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;

import java.util.Map;

public class HttpClient {

    /**
     * 机器人TOKEN
     */
    private static String BOT_TOKEN = "6052233578:AAEwDOV2tg95U0a1gamDRHerbYdeU6jrEVg";

    /**
     * API地址
     */
    final static String BOT_API_ADDRESS = "https://api.telegram.org/bot";

    public static String post(String method, Object obj){

        String result;

        String url=BOT_API_ADDRESS + BOT_TOKEN + "/" + method;

        if (obj == null) {
            result= HttpRequest.post(url)
                    .execute().body();
        }else {
            result = HttpRequest.post(url)
                    .body(JSONUtil.toJsonStr(obj))
                    .execute().body();
        }
        return result;
    }
}
