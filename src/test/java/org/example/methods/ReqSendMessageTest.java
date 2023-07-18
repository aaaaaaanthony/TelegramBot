//package org.example.methods;
//
//import org.example.entity.*;
//import org.example.entity.request.ReqSendMessage;
//import org.junit.jupiter.api.Test;
//
//
//class ReqSendMessageTest {

//
//    /**
//     * 	InlineKeyboardMarkup 键盘
//     */
//    @Test
//    void sendMessage8() {
//
//        InlineKeyboardButton button1 = new InlineKeyboardButton();
//        button1.setCallbackData("111");
//        button1.setText("我是按钮1");
//
//        InlineKeyboardButton button2 = new InlineKeyboardButton();
//        button2.setText("我是按钮2");
//        button2.setCallbackData("2222");
//
//        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
//        InlineKeyboardButton [][] inlineKeyboardMarkups = new InlineKeyboardButton[2][1];
//        inlineKeyboardMarkups[0][0] = button1;
//        inlineKeyboardMarkups[1][0] = button2;
//        inlineKeyboardMarkup.setInlineKeyboard(inlineKeyboardMarkups);
//
//        // 回复这个消息
//        ReqSendMessage sendSecond = new ReqSendMessage();
////        sendSecond.setChatId(BOT_CHAT_ID);
//        sendSecond.setText("InlineKeyboardMarkup 测试Demo");
//        sendSecond.setReplyMarkup(inlineKeyboardMarkup);
//        SendMessage.sendMessage(sendSecond);
//    }
//
//    /**
//     * 	ReplyKeyboardMarkup 键盘
//     *
//     */
//    @Test
//    void sendMessage9() {
//
//        KeyboardButton button1 = new KeyboardButton();
//        button1.setText("我是按钮1");
//
//        KeyboardButton button2 = new KeyboardButton();
//        button2.setText("我是按钮2");
//
//
//        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
//
//        KeyboardButton[][] buttons = new KeyboardButton[1][2];
//        buttons[0][0] = button1;
//        buttons[0][1] = button2;
//
//
//        replyKeyboardMarkup.setKeyboard(buttons);
//
//
//        // 回复这个消息
//        ReqSendMessage sendSecond = new ReqSendMessage();
////        sendSecond.setChatId(BOT_CHAT_ID);
//        sendSecond.setText("ReplyKeyboardMarkup 测试Demo");
//        sendSecond.setReplyMarkup(replyKeyboardMarkup);
//        SendMessage.sendMessage(sendSecond);
//    }
//
//    /**
//     * 	ReplyKeyboardMarkup 键盘
//     * 	测试  one_time_keyboard
//     *
//     */
//    @Test
//    void sendMessage9_1() {
//
//        KeyboardButton button1 = new KeyboardButton();
//        button1.setText("我是按钮3");
//
//        KeyboardButton button2 = new KeyboardButton();
//        button2.setText("我是按钮4");
//
//
//        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
//        replyKeyboardMarkup.setOneTimeKeyboard(true);
//
//        KeyboardButton[][] buttons = new KeyboardButton[1][2];
//        buttons[0][0] = button1;
//        buttons[0][1] = button2;
//
//
//        replyKeyboardMarkup.setKeyboard(buttons);
//
//
//        // 回复这个消息
//        ReqSendMessage sendSecond = new ReqSendMessage();
////        sendSecond.setChatId(BOT_CHAT_ID);
//        sendSecond.setText("ReplyKeyboardMarkup 测试Demo");
//        sendSecond.setReplyMarkup(replyKeyboardMarkup);
//        SendMessage.sendMessage(sendSecond);
//    }
//
//    /**
//     * 	ReplyKeyboardRemove 键盘
//     * 	效果就是删除了
//     *
//     */
//    @Test
//    void sendMessage10() {
//        ReplyKeyboardRemove replyKeyboardRemove = new ReplyKeyboardRemove();
//        replyKeyboardRemove.setRemoveKeyboard(true);
//
//        // 回复这个消息
//        ReqSendMessage sendSecond = new ReqSendMessage();
////        sendSecond.setChatId(BOT_CHAT_ID);
//        sendSecond.setText("删除输入框外面的键盘 测试Demo");
//        sendSecond.setReplyMarkup(replyKeyboardRemove);
//        SendMessage.sendMessage(sendSecond);
//    }
//
//    /**
//     * 	ForceReply 键盘
//     *
//     */
//    @Test
//    void sendMessage11() {
//        ForceReply replyKeyboardRemove = new ForceReply();
//        replyKeyboardRemove.setForceReply(true);
//        replyKeyboardRemove.setInputFieldPlaceholder("请输入回复的消息");
//
//        // 回复这个消息
//        ReqSendMessage sendSecond = new ReqSendMessage();
////        sendSecond.setChatId(BOT_CHAT_ID);
//        sendSecond.setText("ForceReply 测试Demo");
//        sendSecond.setReplyMarkup(replyKeyboardRemove);
//        SendMessage.sendMessage(sendSecond);
//    }
//
//
//
//}