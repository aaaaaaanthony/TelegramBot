package org.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class PollAnswer {
    /**
     * Unique poll identifier.
     */
    private String pollId;

    /**
     * The user who changed the answer to the poll.
     */
    private User user;

    /**
     * 0-based identifiers of answer options, chosen by the user.
     * May be empty if the user retracted their vote.
     */
    private List<Integer> optionIds;

    // You can also add custom methods and additional fields as per your requirements
}

