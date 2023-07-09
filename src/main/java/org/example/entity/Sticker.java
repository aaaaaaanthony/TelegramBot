package org.example.entity;

import lombok.Data;

@Data
public class Sticker {
    /**
     * Unique identifier for this file
     */
    private String fileId;

    /**
     * Sticker width
     */
    private Integer width;

    /**
     * Sticker height
     */
    private Integer height;

    /**
     * Optional. Sticker thumbnail in the .webp or .jpg format
     */
    private PhotoSize thumb;

    /**
     * Optional. Emoji associated with the sticker
     */
    private String emoji;

    /**
     * Optional. Name of the sticker set to which the sticker belongs
     */
    private String setName;

    /**
     * Optional. File size
     */
    private Integer fileSize;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

