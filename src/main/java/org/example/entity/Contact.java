package org.example.entity;

import lombok.Data;

@Data
public class Contact {
    /**
     * Contact's phone number
     */
    private String phoneNumber;

    /**
     * Contact's first name
     */
    private String firstName;

    /**
     * Optional. Contact's last name
     */
    private String lastName;

    /**
     * Optional. Contact's user identifier in Telegram
     */
    private Integer userId;

    /**
     * Optional. Additional data about the contact in the form of a vCard
     */
    private String vcard;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

