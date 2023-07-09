package org.example.entity;

import lombok.Data;

@Data
public class OrderInfo {
    /**
     * Optional. User name
     */
    private String name;

    /**
     * Optional. User's phone number
     */
    private String phoneNumber;

    /**
     * Optional. User email address
     */
    private String email;

    /**
     * Optional. User shipping address
     */
    private ShippingAddress shippingAddress;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

