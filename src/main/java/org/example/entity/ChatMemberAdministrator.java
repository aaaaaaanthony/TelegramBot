package org.example.entity;

import lombok.Data;

@Data
public class ChatMemberAdministrator extends ChatMember{
    /**
     * The member's status in the chat, always "administrator".
     */
    private String status;

    /**
     * Information about the user.
     */
    private User user;

    /**
     * True, if the bot is allowed to edit administrator privileges of that user.
     */
    private boolean canBeEdited;

    /**
     * True, if the user's presence in the chat is hidden.
     */
    private boolean isAnonymous;

    /**
     * True, if the administrator can access the chat event log, chat statistics, message statistics in channels,
     * see channel members, see anonymous administrators in supergroups and ignore slow mode. Implied by any other administrator privilege.
     */
    private boolean canManageChat;

    /**
     * True, if the administrator can delete messages of other users.
     */
    private boolean canDeleteMessages;

    /**
     * True, if the administrator can manage video chats.
     */
    private boolean canManageVideoChats;

    /**
     * True, if the administrator can restrict, ban or unban chat members.
     */
    private boolean canRestrictMembers;

    /**
     * True, if the administrator can add new administrators with a subset of their own privileges or
     * demote administrators that they have promoted, directly or indirectly (promoted by administrators that were appointed by the user).
     */
    private boolean canPromoteMembers;

    /**
     * True, if the user is allowed to change the chat title, photo and other settings.
     */
    private boolean canChangeInfo;

    /**
     * True, if the user is allowed to invite new users to the chat.
     */
    private boolean canInviteUsers;

    /**
     * (Optional) True, if the administrator can post in the channel; channels only.
     */
    private boolean canPostMessages;

    /**
     * (Optional) True, if the administrator can edit messages of other users and can pin messages; channels only.
     */
    private boolean canEditMessages;

    /**
     * (Optional) True, if the user is allowed to pin messages; groups and supergroups only.
     */
    private boolean canPinMessages;

    /**
     * (Optional) True, if the user is allowed to create, rename, close, and reopen forum topics; supergroups only.
     */
    private boolean canManageTopics;

    /**
     * (Optional) Custom title for this user.
     */
    private String customTitle;

    // You can also add custom methods and additional fields as per your requirements
}

