package org.example;

import lombok.Data;

@Data
public class KeyboardButton {

    /**
     * Text of the button. If none of the optional fields are used, it will be sent as a message when the button is pressed
     */
    private String text;
}
