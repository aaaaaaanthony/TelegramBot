package org.example.methods;

import cn.hutool.core.lang.Console;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.example.HttpClient;
import org.example.entity.Message;
import org.example.entity.request.ReqForwardMessage;
import org.example.entity.request.ReqSendMessage;

import java.util.HashMap;
import java.util.Map;

import static org.example.methods.Config.BOT_CHAT_ID;
import static org.example.methods.Config.BOT_TOKEN;

public class ForwardMessage {

    public static Message forwardMessage(ReqForwardMessage reqForwardMessage){

        String method = "forwardMessage";
        String result = HttpClient.post(method, reqForwardMessage);
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
