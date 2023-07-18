package org.example.entity.request;

import cn.hutool.core.annotation.Alias;
import lombok.Data;
import org.example.anno.RequestMethod;

/**
 * 转发消息
 * Use this method to forward messages of any kind. Service messages can't be forwarded. On success, the sent Message is returned.
 * 使用这个方法可以转发任何消息, 服务消息不能转发, 转发成功之后,返回{@link org.example.entity.Message}
 * TODO 有时候可以,有时候不行没搞懂
 */
@Data
@RequestMethod("forwardMessage")
public class ReqForwardMessage {

    /**
     * The chat ID of the target chat or the username of the target channel (in the format @channelusername).
     */
    @Alias("chat_id")
    private Integer chatId;

    /**
     * The unique identifier for the target message thread (topic) of the forum; for forum supergroups only.
     * TODO 不知道干啥的
     */
    private Integer messageThreadId;

    /**
     * The chat ID of the chat where the original message was sent (or channel username in the format @channelusername).
     */
    @Alias("from_chat_id")
    private Integer fromChatId;

    /**
     * Whether to send the message silently. Users will receive a notification with no sound.
     * 用户收到消息,没有声音,只有提示
     */
    @Alias("disable_notification")
    private Boolean disableNotification;

    /**
     * Whether to protect the contents of the forwarded message from forwarding and saving.
     * 让消息不被转发
     */
    @Alias("protect_content")
    private Boolean protectContent;

    /**
     * The message identifier in the chat specified in from_chat_id.
     * 比如A群发了一条消息,消息的ID=10086   就是messageId
     */
    @Alias("message_id")
    private Integer messageId;

}

