package org.example.entity;

import lombok.Data;

@Data
public class PassportData {
    /**
     * Array with information about documents and other Telegram Passport elements that was shared with the bot
     */
    private EncryptedPassportElement[] data;

    /**
     * Encrypted credentials required to decrypt the data
     */
    private EncryptedCredentials credentials;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

