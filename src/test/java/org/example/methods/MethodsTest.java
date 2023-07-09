package org.example.methods;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.setting.dialect.Props;
import org.example.client.TelegramBot;
import org.junit.jupiter.api.Test;

class MethodsTest {



    static void init(){
        new Thread(new TelegramBot()).start();
    }

    @Test
    void readConfig(){
        Props props = new Props("config.properties");
        String user = props.getProperty("BOT_TOKEN");
        String driver = props.getStr("BOT_CHAT_ID");
        System.out.println(user);
        System.out.println(driver);
    }

    @Test
    void sendMessage() {
        Methods.sendMessage();
    }
}