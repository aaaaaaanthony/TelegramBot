package org.example.entity;

import lombok.Data;

@Data
public class CallbackQuery {
    /**
     * Unique identifier for this query.
     */
    private String id;

    /**
     * Sender.
     */
    private User from;

    /**
     * (Optional) Message with the callback button that originated the query.
     * Note that message content and message date will not be available if the message is too old.
     */
    private Message message;

    /**
     * (Optional) Identifier of the message sent via the bot in inline mode, that originated the query.
     */
    private String inlineMessageId;

    /**
     * Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent.
     * Useful for high scores in games.
     */
    private String chatInstance;

    /**
     * (Optional) Data associated with the callback button.
     * Be aware that the message originated the query can contain no callback buttons with this data.
     */
    private String data;

    /**
     * (Optional) Short name of a Game to be returned, serves as the unique identifier for the game.
     */
    private String gameShortName;

    // You can also add custom methods and additional fields as per your requirements
}

