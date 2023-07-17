package org.example.entity;

import lombok.Data;

@Data
public class ChatMemberUpdated {
    /**
     * Chat the user belongs to.
     */
    private Chat chat;

    /**
     * Performer of the action, which resulted in the change.
     */
    private User from;

    /**
     * Date the change was done in Unix time.
     */
    private int date;

    /**
     * Previous information about the chat member.
     */
    private ChatMember oldChatMember;

    /**
     * New information about the chat member.
     */
    private ChatMember newChatMember;

    /**
     * (Optional) Chat invite link, which was used by the user to join the chat; for joining by invite link events only.
     */
    private ChatInviteLink inviteLink;

    /**
     * (Optional) True, if the user joined the chat via a chat folder invite link.
     */
    private boolean viaChatFolderInviteLink;

    // You can also add custom methods and additional fields as per your requirements
}

