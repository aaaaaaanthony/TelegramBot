package org.example.entity;

import lombok.Data;

@Data
public class Animation {
    /**
     * Unique identifier for this file
     */
    private String fileId;

    /**
     * Optional. Animation thumbnail as defined by sender
     */
    private PhotoSize thumb;

    /**
     * Optional. Original animation filename as defined by sender
     */
    private String fileName;

    /**
     * Optional. MIME type of the file as defined by sender
     */
    private String mimeType;

    /**
     * Optional. File size
     */
    private Integer fileSize;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

