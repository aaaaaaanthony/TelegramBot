package org.example.client;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.example.anno.RequestMethod;
import org.example.entity.CallbackQuery;
import org.example.entity.Message;
import org.example.entity.Update;
import org.example.util.HttpClient;

import java.util.List;

/**
 * 抽象处理器
 */
@Slf4j
public abstract class AbstractHandle {

    public Message send(Object obj) {
        // 方法名
        String method = null;

        // 反射,获取请求参数的的方法
        Class<?> clazz = obj.getClass();
        if (clazz.isAnnotationPresent(RequestMethod.class)) {
            RequestMethod annotation = clazz.getAnnotation(RequestMethod.class);
            String value = annotation.value();
            System.out.println("Class annotation value: " + value);
            method = value;
        }

        if (method == null) {
            throw new RuntimeException("系统异常,没有声明方法名字");
        }

        String result = HttpClient.post(method, obj);
        JSONObject entries = JSONUtil.parseObj(result);
        Boolean ok = entries.getBool("ok");
        if (!ok) {
            throw new RuntimeException(String.format("发送请求报错,方式是:%s,报错详情:%s", method, result));
        } else {
            result = entries.getObj("result").toString();
            System.out.println("原始信息:" + result);
            Message message = JSONUtil.toBean(result, Message.class);
//            System.out.println("格式化信息:"+message);
            return message;
        }
    }

    protected void handler(String responseBody) {
        JSONObject entries = JSONUtil.parseObj(responseBody);
        Boolean ok = entries.getBool("ok");
        // 判断状态请求是否成功
        if (ok) {

            // 判断是否有数据
            JSONArray result = entries.getJSONArray("result");
            int size = result.size();
            if (size == 0) { // 没有新的消息

            }else {
                List<Update> list = JSONUtil.toList(result.toString(), Update.class);
                list.forEach(update -> {
                    Message message = update.getMessage();
                    if (message != null) {
                        String text = message.getText();

                        if (text != null) {
                            if (text.startsWith("/")) {
                                // 处理命令消息
                                commandMsg(message);
                            } else {
                                // 处理普通文本消息
                                text(message);
                            }
                        }
                    } else {
                        CallbackQuery callbackQuery = update.getCallbackQuery();
                        if (callbackQuery != null) {

                            callbackQuery(callbackQuery);
                        } else {
                            System.out.println("消息是空的");
                        }
                    }
                });


            }
        } else {
            log.warn("请求报错:{}", responseBody);
        }
    }

    protected abstract void commandMsg(Message message);

    protected abstract void text(Message message);

    protected abstract void callbackQuery(CallbackQuery callbackQuery);

}
