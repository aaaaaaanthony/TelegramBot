package org.example.entity;

import lombok.Data;

@Data
public class Voice {
    /**
     * Unique identifier for this file
     */
    private String fileId;

    /**
     * Duration of the audio in seconds as defined by sender
     */
    private Integer duration;

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

