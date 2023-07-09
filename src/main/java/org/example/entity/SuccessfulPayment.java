package org.example.entity;

import lombok.Data;

@Data
public class SuccessfulPayment {
    /**
     * Three-letter ISO 4217 currency code
     */
    private String currency;

    /**
     * Total price in the smallest units of the currency
     */
    private Integer totalAmount;

    /**
     * Unique identifier for the payment
     */
    private String invoicePayload;

    /**
     * Optional. Identifier of the shipping option chosen by the user
     */
    private String shippingOptionId;

    /**
     * Optional. Order info provided by the user
     */
    private OrderInfo orderInfo;

    /**
     * Telegram payment identifier
     */
    private String telegramPaymentChargeId;

    /**
     * Provider payment identifier
     */
    private String providerPaymentChargeId;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

