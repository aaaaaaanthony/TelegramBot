package org.example.entity;

import lombok.Data;

@Data
public class VideoNote {
    /**
     * Unique identifier for this file
     */
    private String fileId;

    /**
     * Video width and height (diameter of the video message) as defined by sender
     */
    private Integer length;

    /**
     * Duration of the video in seconds as defined by sender
     */
    private Integer duration;

    /**
     * Optional. Video thumbnail
     */
    private PhotoSize thumb;

    /**
     * Optional. File size
     */
    private Integer fileSize;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}
