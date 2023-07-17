package org.example.entity;

import lombok.Data;

@Data
public class PreCheckoutQuery {
    /**
     * Unique query identifier.
     */
    private String id;

    /**
     * User who sent the query.
     */
    private User from;

    /**
     * Three-letter ISO 4217 currency code.
     */
    private String currency;

    /**
     * Total price in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45 pass amount = 145.
     * See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    private int totalAmount;

    /**
     * Bot specified invoice payload.
     */
    private String invoicePayload;

    /**
     * (Optional) Identifier of the shipping option chosen by the user.
     */
    private String shippingOptionId;

    /**
     * (Optional) Order information provided by the user.
     */
    private OrderInfo orderInfo;

    // You can also add custom methods and additional fields as per your requirements
}

