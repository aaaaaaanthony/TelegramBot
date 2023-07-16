package org.example.entity;

import cn.hutool.core.annotation.Alias;
import lombok.Data;

@Data
public class InlineKeyboardButton {
    /**
     * Label text on the button
     * 按钮标签文本
     */
    private String text;

    /**
     * Optional. HTTP or tg:// URL to be opened when button is pressed
     */
    private String url;

    /**
     * Optional. Data to be sent in a callback query to the bot when button is pressed, 1-64 bytes
     * 可选的,在点击按钮之后,按钮信息会被发送到 机器人开发者的服务器上
     * 虽然是可选的,不设置,会有报错==>can't parse inline keyboard button: Text buttons are unallowed in the inline keyboard
     */
    @Alias("callback_data")
    private String callbackData;

    /**
     * Optional. Description of the Web App that will be launched when the user presses the button.
     * The Web App will be able to send an arbitrary message on behalf of the user using the method answerWebAppQuery. Available only in private chats between a user and the bot.
     */
    @Alias("web_app")
    private WebAppInfo webApp;

    /**
     * Optional. An HTTP URL used to automatically authorize the user. Can be used as a replacement for the Telegram Login Widget.
     */
    @Alias("login_url")
    private LoginUrl loginUrl;

    /**
     * Optional. If set, pressing the button will prompt the user to select one of their chats, open that chat and insert the bot‘s username and the specified inline query in the input field. Can be empty, in which case just the bot’s username will be inserted.
     */
    private String switchInlineQuery;

    /**
     * Optional. If set, pressing the button will insert the bot‘s username and the specified inline query in the current chat's input field. Can be empty, in which case only the bot’s username will be inserted.
     */
    private String switchInlineQueryCurrentChat;

    /**
     * Optional. If set, pressing the button will insert the bot‘s username and the specified inline query in the current chat's input field. Can be empty, in which case only the bot’s username will be inserted.
     */
    private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;

    /**
     * Optional. Description of the game that will be launched when the user presses the button.
     */
    private CallbackGame callbackGame;

    /**
     * Optional. Specify True, to send a Pay button.
     */
    private Boolean pay;
}

