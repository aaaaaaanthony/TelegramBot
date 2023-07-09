package org.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class Message {
    /**
     * Unique message identifier inside this chat
     * 这个聊天的唯一的消息ID
     */
    private Integer messageId;

    /**
     * Optional. Unique identifier of a message thread to which the message belongs; for supergroups only
     * 可选的,消息属于的线程唯一ID；仅适用于超级组
     */
    private Integer messageThreadId;

    /**
     * Optional. Sender of the message; empty for messages sent to channels. For backward compatibility, the field contains a fake sender user in non-channel chats, if the message was sent on behalf of a chat.
     * 可选的,消息发送者; 空消息发到channels,可以删除
     * // TODO 看不懂
     */
    private User from;

    /**
     * Optional. Sender of the message, sent on behalf of a chat. For example, the channel itself for channel posts, the supergroup itself for messages from anonymous group administrators,
     * the linked channel for messages automatically forwarded to the discussion group. For backward compatibility,
     * the field from contains a fake sender user in non-channel chats, if the message was sent on behalf of a chat.
     *
     * 可选的,消息的发送者;
     */
    private Chat senderChat;

    /**
     * Date the message was sent in Unix time
     */
    private Integer date;

    /**
     * Conversation the message belongs to
     */
    private Chat chat;

    /**
     * For forwarded messages, sender of the original message
     */
    private User forwardFrom;

    /**
     * For messages forwarded from channels or from anonymous administrators, information about the original sender chat
     */
    private Chat forwardFromChat;

    /**
     * For messages forwarded from channels, identifier of the original message in the channel
     */
    private Integer forwardFromMessageId;

    /**
     * For forwarded messages that were originally sent in channels or by an anonymous chat administrator,
     * signature of the message sender if present
     */
    private String forwardSignature;

    /**
     * Sender's name for messages forwarded from users who disallow adding a link to their account in forwarded messages
     */
    private String forwardSenderName;

    /**
     * For forwarded messages, date the original message was sent in Unix time
     */
    private Integer forwardDate;

    /**
     * True, if the message is sent to a forum topic
     */
    private Boolean isTopicMessage;

    /**
     * True, if the message is a channel post that was automatically forwarded to the connected discussion group
     */
    private Boolean isAutomaticForward;

    /**
     * For replies, the original message
     */
    private Message replyToMessage;

    /**
     * Bot through which the message was sent
     */
    private User viaBot;

    /**
     * Date the message was last edited in Unix time
     */
    private Integer editDate;

    /**
     * True, if the message can't be forwarded
     */
    private Boolean hasProtectedContent;

    /**
     * The unique identifier of a media message group this message belongs to
     */
    private String mediaGroupId;

    /**
     * Signature of the post author for messages in channels, or the custom title of an anonymous group administrator
     */
    private String authorSignature;

    /**
     * For text messages, the actual UTF-8 text of the message
     */
    private String text;

    /**
     * For text messages, special entities like usernames, URLs, bot commands, etc. that appear in the text
     */
    private List<MessageEntity> entities;

    /**
     * Message is an animation, information about the animation
     */
    private Animation animation;

    /**
     * Message is an audio file, information about the file
     */
    private Audio audio;

    /**
     * Message is a general file, information about the file
     */
    private Document document;

    /**
     * Message is a photo, available sizes of the photo
     */
    private List<PhotoSize> photo;

    /**
     * Message is a sticker, information about the sticker
     */
    private Sticker sticker;

    /**
     * Message is a video, information about the video
     */
    private Video video;

    /**
     * Message is a video note, information about the video message
     */
    private VideoNote videoNote;

    /**
     * Message is a voice message, information about the file
     */
    private Voice voice;

    /**
     * Caption for the animation, audio, document, photo, video, or voice
     */
    private String caption;

    /**
     * For messages with a caption, special entities like usernames, URLs, bot commands, etc. that appear in the caption
     */
    private List<MessageEntity> captionEntities;

    /**
     * True, if the message media is covered by a spoiler animation
     */
    private Boolean hasMediaSpoiler;

    /**
     * Message is a shared contact, information about the contact
     */
    private Contact contact;

    /**
     * Message is a dice with a random value
     */
    private Dice dice;

    /**
     * Message is a game, information about the game
     */
    private Game game;

    /**
     * Message is a native poll, information about the poll
     */
    private Poll poll;

    /**
     * Message is a venue, information about the venue
     */
    private Venue venue;

    /**
     * Message is a shared location, information about the location
     */
    private Location location;

    /**
     * New members that were added to the group or supergroup and information about them
     */
    private List<User> newChatMembers;

    /**
     * A member was removed from the group, information about them
     */
    private User leftChatMember;

    /**
     * A chat title was changed to this value
     */
    private String newChatTitle;

    /**
     * A chat photo was changed to this value
     */
    private List<PhotoSize> newChatPhoto;

    /**
     * Service message: the chat photo was deleted
     */
    private Boolean deleteChatPhoto;

    /**
     * Service message: the group has been created
     */
    private Boolean groupChatCreated;

    /**
     * Service message: the supergroup has been created
     */
    private Boolean supergroupChatCreated;

    /**
     * Service message: the channel has been created
     */
    private Boolean channelChatCreated;

    /**
     * Service message: auto-delete timer settings changed in the chat
     */
    private MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;

    /**
     * The group has been migrated to a supergroup with the specified identifier
     */
    private Integer migrateToChatId;

    /**
     * The supergroup has been migrated from a group with the specified identifier
     */
    private Integer migrateFromChatId;

    /**
     * Specified message was pinned
     */
    private Message pinnedMessage;

    /**
     * Invoice for a payment, information about the invoice
     */
    private Invoice invoice;

    /**
     * Service message about a successful payment, information about the payment
     */
    private SuccessfulPayment successfulPayment;

    /**
     * Service message: a user was shared with the bot
     */
    private UserShared userShared;

    /**
     * Service message: a chat was shared with the bot
     */
    private ChatShared chatShared;

    /**
     * The domain name of the website on which the user has logged in
     */
    private String connectedWebsite;

    /**
     * Service message: the user allowed the bot added to the attachment menu to write messages
     */
    private WriteAccessAllowed writeAccessAllowed;

    /**
     * Telegram Passport data
     */
    private PassportData passportData;

    /**
     * Service message. A user in the chat triggered another user's proximity alert while sharing Live Location
     */
    private ProximityAlertTriggered proximityAlertTriggered;

    /**
     * Service message: forum topic created
     */
    private ForumTopicCreated forumTopicCreated;

    /**
     * Service message: forum topic edited
     */
    private ForumTopicEdited forumTopicEdited;

    /**
     * Service message: forum topic closed
     */
    private ForumTopicClosed forumTopicClosed;

    /**
     * Service message: forum topic reopened
     */
    private ForumTopicReopened forumTopicReopened;

    /**
     * Service message: the 'General' forum topic hidden
     */
    private GeneralForumTopicHidden generalForumTopicHidden;

    /**
     * Service message: the 'General' forum topic unhidden
     */
    private GeneralForumTopicUnhidden generalForumTopicUnhidden;

    /**
     * Service message: video chat scheduled
     */
    private VideoChatScheduled videoChatScheduled;

    /**
     * Service message: video chat started
     */
    private VideoChatStarted videoChatStarted;

    /**
     * Service message: video chat ended
     */
    private VideoChatEnded videoChatEnded;

    /**
     * Service message: new participants invited to a video chat
     */
    private VideoChatParticipantsInvited videoChatParticipantsInvited;

    /**
     * Service message: data sent by a Web App
     */
    private WebAppData webAppData;

    /**
     * Inline keyboard attached to the message.
     * login_url buttons are represented as ordinary url buttons.
     */
    private InlineKeyboardMarkup replyMarkup;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

