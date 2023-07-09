package org.example.entity;

import lombok.Data;

@Data
public class ChatLocation {
    /**
     * The location to which the supergroup is connected
     */
    private Location location;

    /**
     * Location address; 1-64 characters, as defined by the chat owner
     */
    private String address;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

