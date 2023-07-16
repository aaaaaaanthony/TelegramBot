package org.example.entity;

import lombok.Data;

import lombok.Data;

/**
 * This object defines the criteria used to request a suitable user. The identifier of the selected user will be shared with the bot when the corresponding button is pressed.
 *
 * @author Bard
 */
@Data
public class KeyboardButtonRequestUser {

    /**
     * A signed 32-bit identifier of the request, which will be received back in the UserShared object. Must be unique within the message.
     */
    private Integer requestId;

    /**
     * Optional. Pass True to request a bot, pass False to request a regular user. If not specified, no additional restrictions are applied.
     */
    private Boolean userIsBot;

    /**
     * Optional. Pass True to request a premium user, pass False to request a non-premium user. If not specified, no additional restrictions are applied.
     */
    private Boolean userIsPremium;

}