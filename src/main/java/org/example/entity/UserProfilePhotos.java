package org.example.entity;

import lombok.Data;

@Data
public class UserProfilePhotos {
    /**
     * Total number of profile pictures the target user has
     */
    private Integer totalCount;

    /**
     * Requested profile pictures (in up to 4 sizes each)
     */
    private PhotoSize[][] photos;

    // Getters and setters

    // You can also add custom methods and constructors as per your requirements
}

