package org.example.entity.request;

import cn.hutool.core.annotation.Alias;
import lombok.Data;
import org.example.anno.RequestMethod;
import org.example.entity.MessageEntity;

import java.util.List;

@Data
@RequestMethod("sendPhone")
public class SendPhoto {
    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * 唯一标识符
     */
    @Alias("chat_id")
    private Integer chatId;

    /**
     * Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * TODO 不懂是啥
     */
    private Integer messageThreadId;

    /**
     * Photo to send. Pass a file_id as String to send a photo that exists on the Telegram servers (recommended),
     * pass an HTTP URL as a String for Telegram to get a photo from the Internet, or upload a new photo using multipart/form-data.
     * The photo must be at most 10 MB in size. The photo's width and height must not exceed 10000 in total.
     * Width and height ratio must be at most 20. More information on Sending Files
     * <p>
     * 照片
     */
    @Alias("photo")
    private String photo;

    /**
     * Photo caption (may also be used when resending photos by file_id), 0-1024 characters after entities parsing
     */
    private String caption;

    /**
     * Mode for parsing entities in the photo caption. See formatting options for more details.
     */
    private String parseMode;

    /**
     * A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parseMode
     */
    private List<MessageEntity> captionEntities;

    /**
     * Pass True if the photo needs to be covered with a spoiler animation
     */
    private Boolean hasSpoiler;

    /**
     * Sends the message silently. Users will receive a notification with no sound.
     */
    private Boolean disableNotification;

    /**
     * Protects the contents of the sent message from forwarding and saving
     */
    private Boolean protectContent;

    /**
     * If the message is a reply, ID of the original message
     */
    private Integer replyToMessageId;

    /**
     * Pass True if the message should be sent even if the specified replied-to message is not found
     */
    private Boolean allowSendingWithoutReply;

    /**
     * Additional interface options. A JSON-serialized object for an inline keyboard,
     * custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
     */
    private Object replyMarkup;
}

