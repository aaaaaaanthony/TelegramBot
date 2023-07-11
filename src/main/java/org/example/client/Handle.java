package org.example.client;

import cn.hutool.json.JSONUtil;
import org.example.entity.Message;

/**
 * 处理器
 */
public class Handle {

    /**
     *
     * @param responseBody 接收到Telegram原始的字符串
     */
    public static void handle(String responseBody){
        Message bean = JSONUtil.toBean(responseBody, Message.class);
    }
}
