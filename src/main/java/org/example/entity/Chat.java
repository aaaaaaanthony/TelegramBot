package org.example.entity;

import lombok.Data;

@Data
public class Chat {
    /**
     * Unique identifier for this chat
     */
    private Long id;

    /**
     * Type of chat, can be "private", "group", "supergroup", or "channel"
     */
    private String type;

    /**
     * Optional. Title of the chat
     */
    private String title;

    /**
     * Optional. Username of the chat
     */
    private String username;

    /**
     * Optional. First name of the other party in a private chat
     */
    private String firstName;

    /**
     * Optional. Last name of the other party in a private chat
     */
    private String lastName;

    /**
     * Optional. Chat photo. Returned only in getChat.
     */
    private ChatPhoto chatPhoto;

    /**
     * Optional. Description, for supergroups and channel chats. Returned only in getChat.
     */
    private String description;

    /**
     * Optional. Chat invite link, for supergroups and channel chats. Returned only in getChat.
     */
    private String inviteLink;

    /**
     * Optional. Pinned message, for supergroups and channel chats. Returned only in getChat.
     */
    private Message pinnedMessage;

    /**
     * Optional. Default chat member permissions, for groups and supergroups. Returned only in getChat.
     */
    private ChatPermissions permissions;

    /**
     * Optional. For supergroups, name of group sticker set. Returned only in getChat.
     */
    private String stickerSetName;

    /**
     * Optional. True, if the bot can change the group sticker set. Returned only in getChat.
     */
    private Boolean canSetStickerSet;

    /**
     * Optional. Unique identifier for the linked chat, i.e. the discussion group identifier for a channel and vice versa; for supergroups and channel chats. Returned only in getChat.
     */
    private Long linkedChatId;

    /**
     * Optional. For supergroups, the location to which the supergroup is connected. Returned only in getChat.
     */
    private ChatLocation location;

    /**
     * Optional. For supergroups, the minimum allowed delay between consecutive messages sent by each unpriviledged user. Returned only in getChat.
     */
    private Integer slowModeDelay;

    /**
     * Optional. For supergroups, name of group sticker set. Returned only in getChat.
     */
    private String slowModeDelayText;

    /**
     * Optional. The unique identifier of a media message group this chat belongs to. Returned only in getChat.
     */
    private String mediaGroupId;

    /**
     * Optional. The default chat member permissions, for groups and supergroups. Returned only in getChat.
     */
    private ChatPermissions defaultChatPermissions;

    /**
     * Optional. The custom title of an anonymous group administrator, for anonymous group administrators. Returned only in getChat.
     */
    private String customTitle;

    /**
     * Optional. True, if the chat messages can include polls. Returned only in getChat.
     */
    private Boolean allowsPolls;

    /**
     * Optional. True, if the chat has scheduled messages. Returned only in getChat.
     */
    private Boolean hasScheduledMessages;

    /**
     * Optional. True, if the chat can be reported to Telegram moderators. Returned only in getChat.
     */
    private Boolean canBeReported;

    /**
     * Optional. True, if the chat allows to pin messages. Returned only in getChat.
     */
    private Boolean canPinMessages;

    /**
     * Optional. True, if the chat allows to promote members to administrators. Returned only in getChat.
     */
    private Boolean canPromoteMembers;

    /**
     * Optional. True, if the chat allows to change the chat title, photo and other settings. Returned only in getChat.
     */
    private Boolean canChangeInfo;

    /**
     * Optional. True, if the chat supports temporary membership. Returned only in getChat.
     */
    private Boolean canSetTemporaryMembership;

    /**
     * Optional. True, if the chat supports inline queries. Returned only in getChat.
     */
    private Boolean canSendMessages;

    /**
     * Optional. True, if the chat supports voice notes. Returned only in getChat.
     */
    private Boolean canSendMediaMessages;

    /**
     * Optional. True, if the chat supports video notes. Returned only in getChat.
     */
    private Boolean canSendVideoNotes;

    /**
     * Optional. True, if the chat supports photos. Returned only in getChat.
     */
    private Boolean canSendPhotos;

    /**
     * Optional. True, if the chat supports audios. Returned only in getChat.
     */
    private Boolean canSendAudios;

    /**
     * Optional. True, if the chat supports documents. Returned only in getChat.
     */
    private Boolean canSendDocuments;

    /**
     * Optional. True, if the chat supports animations. Returned only in getChat.
     */
    private Boolean canSendAnimations;

    /**
     * Optional. True, if the chat supports games. Returned only in getChat.
     */
    private Boolean canSendGames;

    /**
     * Optional. True, if the chat supports stickers. Returned only in getChat.
     */
    private Boolean canSendStickers;

    /**
     * Optional. True, if the chat supports video files. Returned only in getChat.
     */
    private Boolean canSendVideo;

    /**
     * Optional. True, if the chat supports contact messages. Returned only in getChat.
     */
    private Boolean canSendContacts;

    /**
     * Optional. True, if the chat supports location messages. Returned only in getChat.
     */
    private Boolean canSendLocation;

    /**
     * Optional. True, if the chat supports venue messages. Returned only in getChat.
     */
    private Boolean canSendVenues;

    /**
     * Optional. True, if the chat supports poll messages. Returned only in getChat.
     */
    private Boolean canSendPolls;

    /**
     * Optional. True, if the chat supports chat member invitations. Returned only in getChat.
     */
    private Boolean canInviteUsers;

    /**
     * Optional. True, if the chat supports message pinning. Returned only in getChat.
     */
    private Boolean canPinMessagesForever;

    /**
     * Optional. True, if the chat supports member restrictions. Returned only in getChat.
     */
    private Boolean canRestrictMembers;

    /**
     * Optional. True, if the chat supports setting chat description. Returned only in getChat.
     */
    private Boolean canSetChatDescription;

    /**
     * Optional. True, if the chat supports setting chat sticker set. Returned only in getChat.
     */
    private Boolean canSetChatStickerSet;

    /**
     * Optional. True, if the chat supports archiving/unarchiving chat members. Returned only in getChat.
     */
    private Boolean canArchiveChatMembers;

    /**
     * Optional. True, if the chat supports filtering all chat members. Returned only in getChat.
     */
    private Boolean canFilterAllChatMembers;
}

