package org.example.entity;

import lombok.Data;

@Data
public class EncryptedPassportElement {
    /**
     * Element type
     */
    private String type;

    /**
     * Optional. Base64-encoded encrypted Telegram Passport element data
     */
    private String data;

    /**
     * Optional. Base64-encoded data hash for data integrity check
     */
    private String hash;

    /**
     * Optional. Base64-encoded encrypted file with the front side of the document, provided by the user
     */
    private PassportFile frontSide;

    /**
     * Optional. Base64-encoded encrypted file with the reverse side of the document, provided by the user
     */
    private PassportFile reverseSide;

    /**
     * Optional. Base64-encoded encrypted file with the selfie of the user holding a document, provided by the user
     */
    private PassportFile selfie;

    /**
     * Optional. Array of encrypted files with translated versions of documents provided by the user
     */
    private PassportFile[] translation;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

