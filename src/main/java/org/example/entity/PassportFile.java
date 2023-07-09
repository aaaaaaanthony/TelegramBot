package org.example.entity;

import lombok.Data;

@Data
public class PassportFile {
    /**
     * Unique identifier for this file
     */
    private String fileId;

    /**
     * File size
     */
    private Integer fileSize;

    /**
     * Unix time when the file was uploaded
     */
    private Integer fileDate;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

