package org.example.entity;

import lombok.Data;

@Data
public class ShippingAddress {
    /**
     * ISO 3166-1 alpha-2 country code
     */
    private String countryCode;

    /**
     * State, if applicable
     */
    private String state;

    /**
     * City
     */
    private String city;

    /**
     * First line for the address
     */
    private String streetLine1;

    /**
     * Second line for the address
     */
    private String streetLine2;

    /**
     * Address post code
     */
    private String postCode;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

