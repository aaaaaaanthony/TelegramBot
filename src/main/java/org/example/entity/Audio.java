package org.example.entity;

import lombok.Data;

@Data
public class Audio {
    /**
     * Unique identifier for this file
     */
    private String fileId;

    /**
     * Duration of the audio in seconds as defined by sender
     */
    private Integer duration;

    /**
     * Optional. Performer of the audio as defined by sender or by audio tags
     */
    private String performer;

    /**
     * Optional. Title of the audio as defined by sender or by audio tags
     */
    private String title;

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

