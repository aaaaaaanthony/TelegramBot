package org.example.entity;

import lombok.Data;

@Data
public class SwitchInlineQueryChosenChat {

    /**
     * Optional. The default inline query to be inserted in the input field. If left empty, only the bot's username will be inserted
     */
    private String query;

    /**
     * Optional. True, if private chats with users can be chosen
     */
    private boolean allow_user_chats;

    /**
     * Optional. True, if private chats with bots can be chosen
     */
    private boolean allow_bot_chats;

    /**
     * Optional. True, if group and supergroup chats can be chosen
     */
    private boolean allow_group_chats;

    /**
     * Optional. True, if channel chats can be chosen
     */
    private boolean allow_channel_chats;

}
