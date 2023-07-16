package org.example.entity;

import cn.hutool.core.annotation.Alias;
import lombok.Data;

/**
 * This object represents an inline keyboard that appears right next to the message it belongs to.
 * 表示内联键盘,在发送的消息文本的后面
 */
@Data
public class InlineKeyboardMarkup {
    /**
     * Array of button rows, each represented by an array of InlineKeyboardButton objects
     * 按钮的二维数组
     */
    @Alias("inline_keyboard")
    private InlineKeyboardButton[][] inlineKeyboard;
}

