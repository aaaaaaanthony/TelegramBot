package org.example.entity;

import lombok.Data;

@Data
public class ShippingQuery {
    /**
     * Unique query identifier.
     */
    private String id;

    /**
     * User who sent the query.
     */
    private User from;

    /**
     * Bot specified invoice payload.
     */
    private String invoicePayload;

    /**
     * User specified shipping address.
     */
    private ShippingAddress shippingAddress;

    // You can also add custom methods and additional fields as per your requirements
}

