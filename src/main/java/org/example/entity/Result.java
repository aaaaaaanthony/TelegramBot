package org.example.entity;

import lombok.Data;

@Data
public class Result {
    long id;
    boolean isBot;
    String firstName;
    String username;
    String canJoinGroups;
    boolean canReadAllGroupMessages;
    boolean supportsInlineQueries;

}
