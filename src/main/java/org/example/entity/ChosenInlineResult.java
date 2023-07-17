package org.example.entity;

import lombok.Data;

@Data
public class ChosenInlineResult {
    /**
     * The unique identifier for the result that was chosen.
     */
    private String resultId;

    /**
     * The user that chose the result.
     */
    private User from;

    /**
     * (Optional) Sender location, only for bots that require user location.
     */
    private Location location;

    /**
     * (Optional) Identifier of the sent inline message.
     * Available only if there is an inline keyboard attached to the message.
     * Will be also received in callback queries and can be used to edit the message.
     */
    private String inlineMessageId;

    /**
     * The query that was used to obtain the result.
     */
    private String query;

    // You can also add custom methods and additional fields as per your requirements
}

