package org.example.methods;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.setting.dialect.Props;
import org.example.client.TelegramBot;
import org.junit.jupiter.api.Test;

class MethodsTest {



    static void init(){
        new Thread(new TelegramBot()).start();
    }

    /**
     * 都配置文件
     */
    @Test
    void readConfig(){
        Props props = new Props("config.properties");
        String user = props.getProperty("BOT_TOKEN");
        String driver = props.getStr("BOT_CHAT_ID");
        System.out.println(user);
        System.out.println(driver);
    }

    /**
     * 让机器人主动发消息给指定用户
     */
    @Test
    void sendMessage() {
        Methods.sendMessage();
    }

    /**
     * 转发消息
     */
    @Test
    void forwardMessage(){
        Methods.forwardMessage();
    }

    /**
     * 复制消息
     */
    @Test
    void copyMessage(){
        Methods.copyMessage();
    }

    /**
     * 发送图片
     */
    @Test
    void sendPhoto(){
        Methods.sendPhoto();
    }

    /**
     * 发送投票
     */
    @Test
    void sendPoll(){
        Methods.sendPoll();
    }

    /**
     * 发送emoji
     */
    @Test
    void sendDice(){
        Methods.sendDice();
    }

    /**
     * 发送聊天状态
     */
    @Test
    void sendChatAction(){
        Methods.sendChatAction();
    }

    /**
     * 发送聊天状态
     */
    @Test
    void getUserProfilePhotos(){
        Methods.getUserProfilePhotos();
    }

    /**
     * 获取会员数量
     */
    @Test
    void getChatMemberCount(){
        Methods.getChatMemberCount();
    }

    /**
     * 获取会员信息
     */
    @Test
    void getChatMember(){
        Methods.getChatMember();
    }


    /**
     * 获取会员信息
     */
    @Test
    void setMyCommands(){
        Methods.setMyCommands();
    }

    /**
     * 获取会员信息
     */
    @Test
    void setChatMenuButton(){
        Methods.setChatMenuButton();
    }








}