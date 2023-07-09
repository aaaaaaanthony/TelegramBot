package org.example.entity;

import lombok.Data;

@Data
public class Poll {
    /**
     * Unique poll identifier
     */
    private String id;

    /**
     * Poll question, 1-255 characters
     */
    private String question;

    /**
     * List of poll options
     */
    private PollOption[] options;

    /**
     * Total number of users that voted in the poll
     */
    private Integer totalVoterCount;

    /**
     * True, if the poll is closed
     */
    private Boolean isClosed;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

