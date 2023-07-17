package org.example.entity;

import lombok.Data;

@Data
public class ChatMemberOwner {
    /**
     * The member's status in the chat, always "creator".
     */
    private String status;

    /**
     * Information about the user.
     */
    private User user;

    /**
     * True, if the user's presence in the chat is hidden.
     */
    private boolean isAnonymous;

    /**
     * (Optional) Custom title for this user.
     */
    private String customTitle;

    // You can also add custom methods and additional fields as per your requirements
}

