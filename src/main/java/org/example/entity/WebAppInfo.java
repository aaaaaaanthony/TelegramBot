package org.example.entity;


import lombok.Data;

@Data
public class WebAppInfo {

    /**
     * An HTTPS URL of a Web App to be opened with additional data as specified in Initializing Web Apps
     */
    private String url;
}
