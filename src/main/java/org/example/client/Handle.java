package org.example.client;

import cn.hutool.json.JSONUtil;

/**
 * 处理器
 */
public class Handle {

    /**
     *
     * @param responseBody 接收到Telegram原始的字符串
     */
    public static void handle(String responseBody){

        JSONUtil.toBean(responseBody,)

    }
}
