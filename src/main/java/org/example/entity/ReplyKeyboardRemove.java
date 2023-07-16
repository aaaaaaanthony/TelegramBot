package org.example.entity;

import cn.hutool.core.annotation.Alias;
import lombok.Data;

/**
 * This object represents the removal of a custom keyboard upon receiving a message with this object.
 * Telegram clients will remove the current custom keyboard and display the default letter-keyboard.
 * By default, custom keyboards are displayed until a new keyboard is sent by a bot.
 * An exception is made for one-time keyboards that are hidden immediately after the user presses a button (see ReplyKeyboardMarkup).
 */
@Data
public class ReplyKeyboardRemove {
    /**
     * Requests clients to remove the custom keyboard.
     * If set to true, the user will not be able to summon this keyboard.
     * If you want to hide the keyboard from sight but keep it accessible, use 'oneTimeKeyboard' in ReplyKeyboardMarkup.
     * 删除用户输入框外面的键盘
     */
    @Alias("remove_keyboard")
    private boolean removeKeyboard;

    /**
     * (Optional) Use this parameter if you want to remove the keyboard for specific users only.
     * Targets:
     *   1) Users that are @mentioned in the text of the Message object;
     *   2) If the bot's message is a reply (has 'replyToMessageId'), the sender of the original message.
     *  删除指定用户的键盘
     */
    private boolean selective;
}

