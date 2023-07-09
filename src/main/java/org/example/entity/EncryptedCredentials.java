package org.example.entity;

import lombok.Data;

@Data
public class EncryptedCredentials {
    /**
     * Base64-encoded encrypted credentials
     */
    private String data;

    /**
     * Base64-encoded data hash for data integrity check
     */
    private String hash;

    /**
     * Base64-encoded secret for decryption
     */
    private String secret;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

