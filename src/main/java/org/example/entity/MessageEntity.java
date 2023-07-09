package org.example.entity;

import lombok.Data;

@Data
public class MessageEntity {
    /**
     * Type of the entity. Can be "mention" (@username), "hashtag" (#hashtag), "cashtag" ($USD), "bot_command" (/start@botname), "url" (https://telegram.org), "email" (example@example.com), "phone_number" (+1234567890), "bold" (bold text), "italic" (italic text), "underline" (underlined text), "strikethrough" (strikethrough text), "code" (monowidth string), "pre" (monowidth block), "text_link" (for clickable text URLs), "text_mention" (for users without usernames)
     */
    private String type;

    /**
     * Offset in UTF-16 code units to the start of the entity
     */
    private Integer offset;

    /**
     * Length of the entity in UTF-16 code units
     */
    private Integer length;

    /**
     * Optional. For "text_link" only, url that will be opened after user taps on the text
     */
    private String url;

    /**
     * Optional. For "text_mention" only, the mentioned user
     */
    private User user;

    /**
     * Optional. For "pre" only, the programming language of the entity text
     */
    private String language;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

