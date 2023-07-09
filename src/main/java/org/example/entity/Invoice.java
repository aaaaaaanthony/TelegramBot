package org.example.entity;

import lombok.Data;

@Data
public class Invoice {
    /**
     * Product name
     */
    private String title;

    /**
     * Product description
     */
    private String description;

    /**
     * Unique bot deep-linking parameter that can be used to generate this invoice
     */
    private String startParameter;

    /**
     * Three-letter ISO 4217 currency code
     */
    private String currency;

    /**
     * Total price in the smallest units of the currency
     */
    private Integer totalAmount;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

