package org.example.methods;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.setting.dialect.Props;

public class Config {

    /**
     * 机器人TOKEN
     */
    public static String BOT_TOKEN;
    /**
     * 机器人CHAT_ID
     */
    public static String BOT_CHAT_ID;

    public static String BOT_USERNAME = "AnthonyNewsBot";

    {
        Props props = new Props("config.properties");
        BOT_TOKEN = props.getProperty("BOT_TOKEN");
        BOT_CHAT_ID = props.getStr("BOT_CHAT_ID");
        BOT_USERNAME = props.getStr("BOT_USERNAME");
        System.out.println("配置文件初始化成功");
    }
}
