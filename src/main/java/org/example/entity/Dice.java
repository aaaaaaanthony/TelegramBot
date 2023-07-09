package org.example.entity;

import lombok.Data;

@Data
public class Dice {
    /**
     * Emoji on which the dice throw animation is based
     */
    private String emoji;

    /**
     * Value of the dice, 1-6
     */
    private Integer value;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

