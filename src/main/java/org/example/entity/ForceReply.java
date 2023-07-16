package org.example.entity;

import cn.hutool.core.annotation.Alias;
import lombok.Data;

/**
 * This object represents a force reply upon receiving a message with this object.
 * Telegram clients will display a reply interface to the user, as if they manually selected the bot's message and tapped 'Reply'.
 * This can be extremely useful if you want to create user-friendly step-by-step interfaces without having to sacrifice privacy mode.
 */
@Data
public class ForceReply {
    /**
     * Shows reply interface to the user, as if they manually selected the bot's message and tapped 'Reply'.
     */
    @Alias("force_reply")
    private boolean forceReply;

    /**
     * (Optional) The placeholder to be shown in the input field when the reply is active; 1-64 characters.
     * 可选择的,没有效果
     * TODO 没有效果
     */
    @Alias("input_field_placeholder")
    private String inputFieldPlaceholder;

    /**
     * (Optional) Use this parameter if you want to force reply from specific users only.
     * Targets:
     *   1) Users that are @mentioned in the text of the Message object;
     *   2) If the bot's message is a reply (has 'replyToMessageId'), the sender of the original message.
     */
    private boolean selective;
}

