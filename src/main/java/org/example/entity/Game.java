package org.example.entity;

import lombok.Data;

@Data
public class Game {
    /**
     * Title of the game
     */
    private String title;

    /**
     * Description of the game
     */
    private String description;

    /**
     * Optional. Photo that will be displayed in the game message in chats
     */
    private PhotoSize[] photo;

    /**
     * Optional. Text that will be displayed in the game message in chats
     */
    private String text;

    /**
     * Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc.
     */
    private MessageEntity[] textEntities;

    /**
     * Optional. Animation that will be displayed in the game message in chats
     */
    private Animation animation;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

