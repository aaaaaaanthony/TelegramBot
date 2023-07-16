package org.example.entity;

import cn.hutool.core.annotation.Alias;
import lombok.Data;
import org.example.KeyboardButton;

/**
 * This object represents a custom keyboard with reply options.
 * For more details and examples, refer to the Telegram Bot API documentation.
 * 在聊天界面输入框的下面
 */
@Data
public class ReplyKeyboardMarkup {
    /**
     * Array of button rows, each represented by an array of KeyboardButton objects.
     * 二维数组
     */
    @Alias("keyboard")
    private KeyboardButton[][] keyboard;

    /**
     * (Optional) Requests clients to always show the keyboard when the regular keyboard is hidden.
     * Defaults to false, in which case the custom keyboard can be hidden and opened with a keyboard icon.
     */
    private boolean isPersistent;

    /**
     * (Optional) Requests clients to resize the keyboard vertically for optimal fit.
     * Defaults to false, in which case the custom keyboard is always of the same height as the app's standard keyboard.
     * 可以选择的,要不要自动设置键盘的大小,相当于响应式
     */
    private boolean resizeKeyboard;

    /**
     * (Optional) Requests clients to hide the keyboard as soon as it's been used.
     * The keyboard will still be available, but clients will automatically display the usual letter-keyboard in the chat.
     * The user can press a special button in the input field to see the custom keyboard again.
     * Defaults to false.
     * TODO 没有效果
     */
    @Alias("one_time_keyboard")
    private boolean oneTimeKeyboard;

    /**
     * (Optional) The placeholder to be shown in the input field when the keyboard is active.
     * Accepts a string with 1-64 characters.
     */
    private String inputFieldPlaceholder;

    /**
     * (Optional) Use this parameter if you want to show the keyboard to specific users only.
     * Targets: 1) users that are @mentioned in the text of the Message object;
     * 2) if the bot's message is a reply (has reply_to_message_id), sender of the original message.
     */
    private boolean selective;
}

