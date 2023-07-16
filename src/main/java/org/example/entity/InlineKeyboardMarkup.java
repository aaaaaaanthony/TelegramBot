package org.example.entity;

import cn.hutool.core.annotation.Alias;
import lombok.Data;

@Data
public class InlineKeyboardMarkup {
    /**
     * Array of button rows, each represented by an array of InlineKeyboardButton objects
     */
    @Alias("inline_keyboard")
    private InlineKeyboardButton[][] inlineKeyboard;

    private User user;
}

