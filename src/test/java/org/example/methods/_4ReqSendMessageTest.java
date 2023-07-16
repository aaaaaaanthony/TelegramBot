package org.example.methods;

import org.example.KeyboardButton;
import org.example.entity.*;
import org.example.entity.request.ReqSendMessage;
import org.junit.jupiter.api.Test;

import static org.example.methods.Config.BOT_CHAT_ID;
import static org.junit.jupiter.api.Assertions.*;

class _4ReqSendMessageTest {

    /**
     * 让机器人主动发消息给指定用户,只是简单的文本
     */
    @Test
    void sendMessage() {
        ReqSendMessage reqSendMessage = new ReqSendMessage();
        reqSendMessage.setChatId(BOT_CHAT_ID);
        // 这里的链接是可以预览的
        reqSendMessage.setText("https://baidu.com");
        _4SendMessage.sendMessage(reqSendMessage);
    }

    /**
     * 发送markdown 或者 html 格式的文本
     */
    @Test
    void sendMessage1() {
//        _4SendMessage.sendMessage("1","2");
    }

    /**
     * 禁用链接
     */
    @Test
    void sendMessage2() {
        ReqSendMessage reqSendMessage = new ReqSendMessage();
        reqSendMessage.setChatId(BOT_CHAT_ID);
        // 这里的链接是可以预览的
        reqSendMessage.setText("https://baidu.com");
        reqSendMessage.setDisableWebPagePreview(true);
        _4SendMessage.sendMessage(reqSendMessage);
    }

    /**
     * 发送消息,不用通知声音,除了声音,别的通知项,还是有的
     */
    @Test
    void sendMessage4() {
        ReqSendMessage reqSendMessage = new ReqSendMessage();
        reqSendMessage.setChatId(BOT_CHAT_ID);
        // 这里的链接是可以预览的
        reqSendMessage.setText("https://baidu.com");
        reqSendMessage.setDisableWebPagePreview(true);
        reqSendMessage.setDisableNotification(true);
        _4SendMessage.sendMessage(reqSendMessage);
    }


    /**
     * 让这条消息,不能被转发
     */
    @Test
    void sendMessage5() {
        ReqSendMessage reqSendMessage = new ReqSendMessage();
        reqSendMessage.setChatId(BOT_CHAT_ID);
        // 这里的链接是可以预览的
        reqSendMessage.setText("https://baidu.com");
        reqSendMessage.setDisableWebPagePreview(true);
        reqSendMessage.setDisableNotification(true);
        reqSendMessage.setProtectContent(true);
        _4SendMessage.sendMessage(reqSendMessage);
    }

    /**
     * 回复消息
     * 先发第一条消息,返回数据获取messageid  再回复
     */
    @Test
    void sendMessage6() {
        // 先发送个消息,获取messageId
        ReqSendMessage sendFirst = new ReqSendMessage();
        sendFirst.setChatId(BOT_CHAT_ID);
        sendFirst.setText("https://baidu.com");
        Message message = _4SendMessage.sendMessage(sendFirst);

        System.out.println("============================================================");

        // 回复这个消息
        ReqSendMessage sendSecond = new ReqSendMessage();
        sendSecond.setChatId(BOT_CHAT_ID);
        sendSecond.setText("OK  OK  OK  OK  OK");
        sendSecond.setReplyToMessageId(message.getMessageId());
        _4SendMessage.sendMessage(sendSecond);
    }

    /**
     * 先发第一条消息,返回数据获取messageid  再回复
     */
    @Test
    void sendMessage7() {
        // 回复这个消息
        ReqSendMessage sendSecond = new ReqSendMessage();
        sendSecond.setChatId(BOT_CHAT_ID);
        sendSecond.setText("OK  OK  OK  OK  OK");
        sendSecond.setAllowSendingWithoutReply(false);
        _4SendMessage.sendMessage(sendSecond);
    }

    /**
     * 	InlineKeyboardMarkup 键盘
     */
    @Test
    void sendMessage8() {

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setCallbackData("111");
        button1.setText("我是按钮1");

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("我是按钮2");
        button2.setCallbackData("2222");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton [][] inlineKeyboardMarkups = new InlineKeyboardButton[2][1];
        inlineKeyboardMarkups[0][0] = button1;
        inlineKeyboardMarkups[1][0] = button2;
        inlineKeyboardMarkup.setInlineKeyboard(inlineKeyboardMarkups);

        // 回复这个消息
        ReqSendMessage sendSecond = new ReqSendMessage();
        sendSecond.setChatId(BOT_CHAT_ID);
        sendSecond.setText("InlineKeyboardMarkup 测试Demo");
        sendSecond.setReplyMarkup(inlineKeyboardMarkup);
        _4SendMessage.sendMessage(sendSecond);
    }

    /**
     * 	ReplyKeyboardMarkup 键盘
     *
     */
    @Test
    void sendMessage9() {

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("我是按钮1");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("我是按钮2");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        KeyboardButton[][] buttons = new KeyboardButton[1][2];
        buttons[0][0] = button1;
        buttons[0][1] = button2;


        replyKeyboardMarkup.setKeyboard(buttons);


        // 回复这个消息
        ReqSendMessage sendSecond = new ReqSendMessage();
        sendSecond.setChatId(BOT_CHAT_ID);
        sendSecond.setText("ReplyKeyboardMarkup 测试Demo");
        sendSecond.setReplyMarkup(replyKeyboardMarkup);
        _4SendMessage.sendMessage(sendSecond);
    }

    /**
     * 	ReplyKeyboardMarkup 键盘
     * 	测试  one_time_keyboard
     *
     */
    @Test
    void sendMessage9_1() {

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("我是按钮3");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("我是按钮4");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setOneTimeKeyboard(true);

        KeyboardButton[][] buttons = new KeyboardButton[1][2];
        buttons[0][0] = button1;
        buttons[0][1] = button2;


        replyKeyboardMarkup.setKeyboard(buttons);


        // 回复这个消息
        ReqSendMessage sendSecond = new ReqSendMessage();
        sendSecond.setChatId(BOT_CHAT_ID);
        sendSecond.setText("ReplyKeyboardMarkup 测试Demo");
        sendSecond.setReplyMarkup(replyKeyboardMarkup);
        _4SendMessage.sendMessage(sendSecond);
    }



}