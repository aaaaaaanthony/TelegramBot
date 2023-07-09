package org.example.entity;

import lombok.Data;

@Data
public class User {


    /**
     * Unique identifier for this user or bot. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it.
     * But it has at most 52 significant bits, so a 64-bit integer or double-precision float type are safe for storing this identifier.
     * 用户或者机器人的唯一标识符
     */
    private Integer id;

    /**
     * True, if this user is a bot
     * True 表示机器人
     */
    private Boolean isBoot;

    /**
     * User's or bot's first name
     * 用户或者机器人的 first name
     */
    private String firstName;

    /**
     * Optional. User's or bot's last name
     * 可选的,用户或者机器人的 last name
     */
    private String lastName;


    /**
     * Optional. User's or bot's username
     * 	可选的,用户或者机器人的 username
     */
    private String username;

    /**
     * Optional. IETF language tag of the user's language
     * 可选的,用户的语言
     */
    private String languageCode;

    /**
     * Optional. True, if this user is a Telegram Premium user
     * 可选的,为True ,就是telegram的付费会员
     */
    private Boolean isPremium;

    /**
     * True	Optional. True, if this user added the bot to the attachment menu
     * 可选的,如果此用户将机器人添加到附件菜单为True
     * TODO 没有明白意思
     */
    private boolean addedToAttachmentMenu;

    /**
     * Optional. True, if the bot can be invited to groups. Returned only in getMe.
     * 可选的,如果机器人被邀请加入群组,仅再getMe()方法返回
     * TODO 没有明白意思
     */
    private Boolean canJoinGroups;

    /**
     * Optional. True, if privacy mode is disabled for the bot. Returned only in getMe.
     * 可选的,如果为True,机器人禁用了隐私模式,仅再getMe()方法返回
     * TODO 没有明白意思
     */
    private Boolean canReadAllGroupMessages;

    /**
     * Optional. True, if the bot supports inline queries. Returned only in getMe.
     * 可选的,如果为True,机器人支持行内查询,仅再getMe()方法返回
     * TODO 没有明白意思
     */
    private Boolean supportsInlineQueries;
}
