package org.example;

import org.example.client.AbstractHandle;
import org.example.entity.CallbackQuery;
import org.example.entity.InlineKeyboardButton;
import org.example.entity.InlineKeyboardMarkup;
import org.example.entity.Message;
import org.example.entity.request.ReqForwardMessage;
import org.example.entity.request.ReqSendMessage;
import org.example.entity.request.SendPhoto;

/**
 * 默认的处理器
 */
public class DefaultHandler extends AbstractHandle {

    @Override
    protected void commandMsg(Message message) {

        if (message != null) {
            String text = message.getText();

            if (text != null) {
                if (text.startsWith("/")) {
                    // 去掉斜杠
                    text = text.substring(1);
                    switch (text) {
                        // 发送简单消息
                        case "发送消息":
                            sendMessage(message);
                            break;
                        case "测试转发":  // 没有测试成功
                            fordMessage(message);
                            break;
                        case "发送图片":
                            SendPhoto sendPhoto = new SendPhoto();
                            sendPhoto.setChatId(message.getFrom().getId());
                            break;
                        default:
                            System.out.println("命令不对");
                    }
                }
            }
        }
    }


    @Override
    protected void text(Message message) {
        System.out.println(message);


    }

    @Override
    protected void callbackQuery(CallbackQuery callbackQuery) {

        String data = callbackQuery.getData();
        if (data.equals("111") || data.equals("222")) {
            dengDengDeng(callbackQuery.getMessage(), "已经收到消息");
        }

    }

    /**
     * 转发消息
     */
    public void fordMessage(Message message) {
        Integer id1 = message.getFrom().getId();
        Integer messageId = message.getMessageId();
        ReqForwardMessage reqForwardMessage = new ReqForwardMessage();
        reqForwardMessage.setMessageId(messageId);
        reqForwardMessage.setFromChatId(id1);
        reqForwardMessage.setChatId(id1);
        send(reqForwardMessage);
    }

    void sendMessage(Message message) {
//        dengDengDeng(message, "下面的链接是可以预览的");
//        ReqSendMessage message2 = new ReqSendMessage();
//        message2.setChatId(message.getChat().getId() + "");
//        message2.setText("https://baidu.com");
//        send(message2);
//
//        dengDengDeng(message, "下面的链接是不可以预览的");
//        ReqSendMessage message4 = new ReqSendMessage();
//        message4.setChatId(message.getChat().getId() + "");
//        message4.setText("https://baidu.com");
//        message4.setDisableWebPagePreview(true);
//        send(message4);
//
//
//        try {
//            dengDengDeng(message, "等一会,3s之后,发送一条不带声音提醒的消息");
//            Thread.sleep(3000);
//            ReqSendMessage message6 = new ReqSendMessage();
//            message6.setChatId(message.getChat().getId() + "");
//            message6.setText("听到声音了吗");
//            // 禁止声音通知
//            message6.setDisableNotification(true);
//            send(message6);
//        } catch (Exception e) {
//
//        }
//
//        dengDengDeng(message, "发送Markdown格式的文本");
//        ReqSendMessage message1 = new ReqSendMessage();
//        message1.setChatId(message.getChat().getId() + "");
//        message1.setParseMode("MarkdownV2");
//        message1.setText("*bold \\*text*\n" +
//                "_italic \\*text_\n" +
//                "__underline__\n" +
//                "~strikethrough~\n" +
//                "||spoiler||\n" +
//                "*bold _italic bold ~italic bold strikethrough ||italic bold strikethrough spoiler||~ __underline italic bold___ bold*\n" +
//                "[inline URL](http://www.example.com/)\n" +
//                "[inline mention of a user](tg://user?id=123456789)\n" +
//                "![\uD83D\uDC4D](tg://emoji?id=5368324170671202286)\n" +
//                "`inline fixed-width code`\n" +
//                "```\n" +
//                "pre-formatted fixed-width code block\n" +
//                "```\n" +
//                "```python\n" +
//                "pre-formatted fixed-width code block written in the Python programming language\n" +
//                "```");
//        send(message1);
//
//        dengDengDeng(message, "发送HTML格式的文本");
//        ReqSendMessage message3 = new ReqSendMessage();
//        message3.setChatId(message.getChat().getId() + "");
//        message3.setParseMode("HTML");
//        message3.setText("<b>bold</b>, <strong>bold</strong>\n" +
//                "<i>italic</i>, <em>italic</em>\n" +
//                "<u>underline</u>, <ins>underline</ins>\n" +
//                "<s>strikethrough</s>, <strike>strikethrough</strike>, <del>strikethrough</del>\n" +
//                "<span class=\"tg-spoiler\">spoiler</span>, <tg-spoiler>spoiler</tg-spoiler>\n" +
//                "<b>bold <i>italic bold <s>italic bold strikethrough <span class=\"tg-spoiler\">italic bold strikethrough spoiler</span></s> <u>underline italic bold</u></i> bold</b>\n" +
//                "<a href=\"http://www.example.com/\">inline URL</a>\n" +
//                "<a href=\"tg://user?id=123456789\">inline mention of a user</a>\n" +
//                "<tg-emoji emoji-id=\"5368324170671202286\">\uD83D\uDC4D</tg-emoji>\n" +
//                "<code>inline fixed-width code</code>\n" +
//                "<pre>pre-formatted fixed-width code block</pre>\n" +
//                "<pre><code class=\"language-python\">pre-formatted fixed-width code block written in the Python programming language</code></pre>");
//        send(message3);
//
//
//        dengDengDeng(message, "发送不能被转发的消息");
//        ReqSendMessage message5 = new ReqSendMessage();
//        message5.setChatId(message.getChat().getId() + "");
//        message5.setProtectContent(true);
//        message5.setText("让这条消息,不能被转发");
//        send(message5);


        dengDengDeng(message, "回复消息,这个消息会被回复");
        ReqSendMessage message6 = new ReqSendMessage();
        message6.setChatId(message.getChat().getId() + "");
        message6.setText("OK  OK  OK  OK  OK");
        message6.setReplyToMessageId(message.getMessageId());
        send(message6);


        dengDengDeng(message, "内联键盘测试");
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("内联键盘按钮1");
        button1.setCallbackData("111");

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("内联键盘按钮2");
        button2.setCallbackData("222");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton[][] inlineKeyboardMarkups = new InlineKeyboardButton[2][1];
        inlineKeyboardMarkups[0][0] = button1;
        inlineKeyboardMarkups[1][0] = button2;
        inlineKeyboardMarkup.setInlineKeyboard(inlineKeyboardMarkups);

        // 回复这个消息
        ReqSendMessage message7 = new ReqSendMessage();
        message7.setChatId(message.getChat().getId() + "");
        message7.setText("InlineKeyboardMarkup 测试Demo");
        message7.setReplyMarkup(inlineKeyboardMarkup);
        send(message7);

    }

    private void dengDengDeng(Message message, String msg) {
        ReqSendMessage message4 = new ReqSendMessage();
        message4.setChatId(message.getChat().getId() + "");
        message4.setText("\uD83D\uDFE0\uD83D\uDFE0\uD83D\uDFE0\uD83D\uDFE0\uD83D\uDFE0" + msg + "\uD83D\uDFE0\uD83D\uDFE0\uD83D\uDFE0\uD83D\uDFE0\uD83D\uDFE0");
        send(message4);
    }
}
