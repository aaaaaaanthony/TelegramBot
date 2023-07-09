package org.example.entity;

import lombok.Data;

@Data
public class ChatPermissions {
    /**
     * True, if the user is allowed to send text messages, contacts, locations, and venues
     */
    private Boolean canSendMessages;

    /**
     * True, if the user is allowed to send audios, documents, photos, videos, video notes, and voice notes
     */
    private Boolean canSendMediaMessages;

    /**
     * True, if the user is allowed to send polls
     */
    private Boolean canSendPolls;

    /**
     * True, if the user is allowed to send animations, games, stickers, and use inline bots
     */
    private Boolean canSendOtherMessages;

    /**
     * True, if the user is allowed to add web page previews to their messages
     */
    private Boolean canAddWebPagePreviews;

    /**
     * True, if the user is allowed to change the chat title, photo, and other settings
     */
    private Boolean canChangeInfo;

    /**
     * True, if the user is allowed to invite new users to the chat
     */
    private Boolean canInviteUsers;

    /**
     * True, if the user is allowed to pin messages
     */
    private Boolean canPinMessages;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

