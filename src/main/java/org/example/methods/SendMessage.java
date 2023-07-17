package org.example.methods;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.example.util.HttpClient;
import org.example.entity.Message;
import org.example.entity.request.ReqSendMessage;

public class SendMessage {


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
    public static Message sendMessage(ReqSendMessage reqSendMessage){
        String method = "sendMessage";
        String result = HttpClient.post(method, reqSendMessage);
        JSONObject entries = JSONUtil.parseObj(result);
        Boolean ok = entries.getBool("ok");
        if (!ok) {
            throw new RuntimeException(String.format("发送请求报错,方式是:%s,报错详情:%s", method, result));
        }else {
            result = entries.getObj("result").toString();
            System.out.println("原始信息:"+result);
            Message message = JSONUtil.toBean(result, Message.class);
            System.out.println("格式化信息:"+message);
            return message;
        }
    }
}
