package org.example.entity;

import lombok.Data;

@Data
public class InlineKeyboardMarkup {
    /**
     * Array of button rows, each represented by an array of InlineKeyboardButton objects
     */
    private InlineKeyboardButton[][] inlineKeyboard;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

