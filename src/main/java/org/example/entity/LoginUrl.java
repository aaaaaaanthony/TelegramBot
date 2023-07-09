package org.example.entity;

import lombok.Data;

import lombok.Data;

@Data
public class LoginUrl {
    /**
     * An HTTP URL to be opened with user authorization data added to the query string when the button is pressed. If the user refuses to provide authorization data, the original URL without information about the user will be opened. The data added is the same as described in Receiving authorization data.
     */
    private String url;

    /**
     * Optional. New text of the button in forwarded messages.
     */
    private String forwardText;

    /**
     * Optional. Username of a bot, which will be used for user authorization. See Setting up a bot for more details. If not specified, the current bot's username will be assumed. The url's domain must be the same as the domain linked with the bot.
     */
    private String botUsername;

    /**
     * Optional. Pass True to request the permission for your bot to send messages to the user.
     */
    private Boolean requestWriteAccess;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}


