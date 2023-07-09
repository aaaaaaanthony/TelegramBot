package org.example.methods;

import cn.hutool.core.lang.Console;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;

import java.util.HashMap;
import java.util.Map;

public class Methods extends Config{

    /**
     * 获取个人信息
     * A simple method for testing your bot's authentication token. Requires no parameters. Returns basic information about the bot in form of a User object.
     * 简单的测试机器人的token,没有参数,返回的是关于机器人的信息,实体类是:{@link org.example.entity.User}
     */
    public static void getMe(){
        String methodName = "/getMe";

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);
    }

    // TODO 未实现
    public static void logOut(){
    }

    // TODO 未实现
    public static void close(){
    }

    /**
     * 发送消息文本消息
     * Use this method to send text messages. On success, the sent Message is returned.
     * 使用这个方法发送文本消息,如果发送成功,返回{@link org.example.entity.Message}
     *
     * chat_id的获取方法: 调用getUpdates方法,给机器人发个消息,就会有了
     * {
     *   "ok": true,
     *   "result": [
     *     {
     *       "update_id": xxxxx,
     *       "message": {
     *         "message_id": xxxxx,
     *         "from": {
     *           "id": xxxxx,
     *           "is_bot": false,
     *           "first_name": "xxxxx",
     *           "username": "xxxxx",
     *           "language_code": "zh-hans"
     *         },
     *         "chat": {
     *           // chat_id
     *           "id": xxxxx,
     *           "first_name": "xxxxx",
     *           "username": "xxxxx",
     *           "type": "private"
     *         },
     *         "date": xxxxx,
     *         "text": "23"
     *       }
     *     }
     *   ]
     * }
     */
    public static void sendMessage(){

        String methodName = "/sendMessage";

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("chat_id", BOT_CHAT_ID);
        objectObjectsHashMap.put("text", "Hello World!");

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(objectObjectsHashMap)
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);

    }


//    public static void getUpdates(){
//        String methodName = "/getUpdates";
//
//        hutoolHttp = HttpRequest.post("https://api.telegram.org/bot" + tokne + methodName + "?offset=999999")
//                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
//                .timeout(20000)//超时，毫秒
//                .keepAlive(true);
//
//        HttpResponse httpResponse = hutoolHttp.executeAsync();
//        String body = httpResponse.body();
//        Console.log(body);
//
//    }
//
//    public static void update(){
//        String methodName = "/update";
//
//        String result2 = HttpRequest.post("https://api.telegram.org/bot" + tokne + methodName)
//                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
//                .timeout(20000)//超时，毫秒
//                .execute().body();
//        Console.log(result2);
//    }



}
