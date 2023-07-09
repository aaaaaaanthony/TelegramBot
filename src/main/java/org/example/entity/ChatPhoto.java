package org.example.entity;

import lombok.Data;

@Data
public class ChatPhoto {
    /**
     * Unique file identifier of small (160x160) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.
     */
    private String smallFileId;

    /**
     * Unique file identifier of big (640x640) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.
     */
    private String bigFileId;

    /**
     * Unique file identifier of small (160x160) chat photo, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    private String smallFileUniqueId;

    /**
     * Unique file identifier of big (640x640) chat photo, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    private String bigFileUniqueId;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

