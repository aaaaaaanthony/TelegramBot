package org.example.entity;

import lombok.Data;

@Data
public class PhotoSize {
    /**
     * Unique identifier for this file
     */
    private String fileId;

    /**
     * Photo width
     */
    private Integer width;

    /**
     * Photo height
     */
    private Integer height;

    /**
     * Optional. File size
     */
    private Integer fileSize;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

