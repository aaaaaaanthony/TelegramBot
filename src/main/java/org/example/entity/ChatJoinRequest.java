package org.example.entity;

import lombok.Data;

@Data
public class ChatJoinRequest {
    /**
     * Chat to which the request was sent.
     */
    private Chat chat;

    /**
     * User that sent the join request.
     */
    private User from;

    /**
     * Identifier of a private chat with the user who sent the join request. This number may have more than 32 significant bits
     * and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits,
     * so a 64-bit integer or double-precision float type are safe for storing this identifier.
     * The bot can use this identifier for 24 hours to send messages until the join request is processed, assuming no other administrator contacted the user.
     */
    private long userChatId;

    /**
     * Date the request was sent in Unix time.
     */
    private int date;

    /**
     * (Optional) Bio of the user.
     */
    private String bio;

    /**
     * (Optional) Chat invite link that was used by the user to send the join request.
     */
    private ChatInviteLink inviteLink;

    // You can also add custom methods and additional fields as per your requirements
}

