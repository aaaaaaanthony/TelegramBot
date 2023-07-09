package org.example.entity;

import lombok.Data;

@Data
public class Venue {
    /**
     * Venue location
     */
    private Location location;

    /**
     * Name of the venue
     */
    private String title;

    /**
     * Address of the venue
     */
    private String address;

    /**
     * Optional. Foursquare identifier of the venue
     */
    private String foursquareId;

    /**
     * Optional. Foursquare type of the venue
     */
    private String foursquareType;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

