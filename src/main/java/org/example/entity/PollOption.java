package org.example.entity;

import lombok.Data;

@Data
public class PollOption {
    /**
     * Option text
     */
    private String text;

    /**
     * Number of users that voted for this option
     */
    private Integer voterCount;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

