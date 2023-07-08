package org.example;

import cn.hutool.core.annotation.Alias;
import cn.hutool.core.lang.Console;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.json.JSONUtil;
import lombok.Data;

import java.util.HashMap;
import java.util.List;


public class Main {

    final static String tokne = "6052233578:AAEwDOV2tg95U0a1gamDRHerbYdeU6jrEVg";

    final static String username = "AnthonyNewsBot";

    static boolean poll = false;

    public static void main(String[] args) {
        while (true) {
            getUpdates();
        }

    }


    static HttpRequest hutoolHttp;


    public static void getUpdates(){
        String methodName = "/getUpdates";

        hutoolHttp = HttpRequest.post("https://api.telegram.org/bot" + tokne + methodName + "?offset=999999")
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .timeout(20000)//超时，毫秒
                .keepAlive(true);

        HttpResponse httpResponse = hutoolHttp.executeAsync();
        String body = httpResponse.body();
        Console.log(body);

    }

    public static void update(){
        String methodName = "/update";

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + tokne + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);
    }


    public static void getMe(){
        String methodName = "/getMe";

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + tokne + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);
    }
}
