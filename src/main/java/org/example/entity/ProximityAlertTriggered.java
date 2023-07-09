package org.example.entity;

import lombok.Data;

@Data
public class ProximityAlertTriggered {
    /**
     * User that triggered the alert
     */
    private User traveler;

    /**
     * User that set the alert
     */
    private User watcher;

    /**
     * The distance between the users
     */
    private Integer distance;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

