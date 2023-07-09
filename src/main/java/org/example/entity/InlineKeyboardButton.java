package org.example.entity;

import lombok.Data;

@Data
public class InlineKeyboardButton {
    /**
     * Label text on the button
     */
    private String text;

    /**
     * Optional. HTTP or tg:// URL to be opened when button is pressed
     */
    private String url;

    /**
     * Optional. An HTTP URL used to automatically authorize the user. Can be used as a replacement for the Telegram Login Widget.
     */
    private LoginUrl loginUrl;

    /**
     * Optional. Data to be sent in a callback query to the bot when button is pressed, 1-64 bytes
     */
    private String callbackData;

    /**
     * Optional. If set, pressing the button will prompt the user to select one of their chats, open that chat and insert the bot‘s username and the specified inline query in the input field. Can be empty, in which case just the bot’s username will be inserted.
     */
    private String switchInlineQuery;

    /**
     * Optional. If set, pressing the button will insert the bot‘s username and the specified inline query in the current chat's input field. Can be empty, in which case only the bot’s username will be inserted.
     */
    private String switchInlineQueryCurrentChat;

    /**
     * Optional. Description of the game that will be launched when the user presses the button.
     */
    private CallbackGame callbackGame;

    /**
     * Optional. Specify True, to send a Pay button.
     */
    private Boolean pay;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

