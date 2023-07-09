package org.example.entity;

import lombok.Data;

@Data
public class Video {
    /**
     * Unique identifier for this file
     */
    private String fileId;

    /**
     * Video width as defined by sender
     */
    private Integer width;

    /**
     * Video height as defined by sender
     */
    private Integer height;

    /**
     * Duration of the video in seconds as defined by sender
     */
    private Integer duration;

    /**
     * Optional. Video thumbnail
     */
    private PhotoSize thumb;

    /**
     * Optional. Original filename as defined by sender
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

