package org.example.methods;

import org.junit.jupiter.api.Test;

class MethodsTest {

    @Test
    void getMe(){
        Methods.getMe();
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