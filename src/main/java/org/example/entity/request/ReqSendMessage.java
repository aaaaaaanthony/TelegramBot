package org.example.entity.request;

import cn.hutool.core.annotation.Alias;
import lombok.Data;
import org.example.anno.RequestMethod;
import org.example.entity.MessageEntity;

import java.util.List;

@Data
@RequestMethod("sendMessage")
public class ReqSendMessage {

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
     * 机器人ID
     */
    @Alias("chat_id")
    private String chatId;

    /**
     * Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * TODO 不知道干啥的
     */
    private Integer messageThreadId;

    /**
     * Text of the message to be sent, 1-4096 characters after entities parsing
     * 要发送的文本
     *
     *
     *
     * 比如markdown,需要在parse_mode 指定"MarkdownV2"
     * *bold \*text*
     * _italic \*text_
     * __underline__
     * ~strikethrough~
     * ||spoiler||
     * *bold _italic bold ~italic bold strikethrough ||italic bold strikethrough spoiler||~ __underline italic bold___ bold*
     * [inline URL](http://www.example.com/)
     * [inline mention of a user](tg://user?id=123456789)
     * ![👍](tg://emoji?id=5368324170671202286)
     * `inline fixed-width code`
     * ```
     * pre-formatted fixed-width code block
     * ```
     * ```python
     * pre-formatted fixed-width code block written in the Python programming language
     * ```
     *
     * 比如HTML,需要在parse_mode 指定"HTML"
     * <b>bold</b>, <strong>bold</strong>
     * <i>italic</i>, <em>italic</em>
     * <u>underline</u>, <ins>underline</ins>
     * <s>strikethrough</s>, <strike>strikethrough</strike>, <del>strikethrough</del>
     * <span class="tg-spoiler">spoiler</span>, <tg-spoiler>spoiler</tg-spoiler>
     * <b>bold <i>italic bold <s>italic bold strikethrough <span class="tg-spoiler">italic bold strikethrough spoiler</span></s> <u>underline italic bold</u></i> bold</b>
     * <a href="http://www.example.com/">inline URL</a>
     * <a href="tg://user?id=123456789">inline mention of a user</a>
     * <tg-emoji emoji-id="5368324170671202286">👍</tg-emoji>
     * <code>inline fixed-width code</code>
     * <pre>pre-formatted fixed-width code block</pre>
     * <pre><code class="language-python">pre-formatted fixed-width code block written in the Python programming language</code></pre>
     */
    private String text;

    /**
     * Mode for parsing entities in the message text. See formatting options for more details.
     */
    @Alias("parse_mode")
    private String parseMode;

    /**
     * A JSON-serialized list of special entities that appear in the message text, which can be specified instead of parse_mode
     * TODO 不知道干嘛的
     */
    private List<MessageEntity> entities;

    /**
     * Disables link previews for links in this message
     * 禁用预览链接
     */
    @Alias("disable_web_page_preview")
    private Boolean disableWebPagePreview;

    /**
     * Sends the message silently. Users will receive a notification with no sound.
     * 发送消息,不用通知声音
     */
    @Alias("disable_notification")
    private Boolean disableNotification;

    /**
     * Protects the contents of the sent message from forwarding and saving
     * 让这条消息,不能被转发
     */
    @Alias("protect_content")
    private Boolean protectContent;

    /**
     * If the message is a reply, ID of the original message
     * 回复指定的消息
     */
    @Alias("reply_to_message_id")
    private Integer replyToMessageId;

    /**
     * Pass True if the message should be sent even if the specified replied-to message is not found
     * 即使找不到指定的回复消息，如果要发送消息，请通过True
     * TODO 没搞懂什么意思
     */
    private Boolean allowSendingWithoutReply;

    /**
     *
     * Additional interface options. A JSON-serialized object for an inline keyboard,
     * custom reply keyboard, instructions to remove reply keyboard, or to force a reply from the user.
     */
    @Alias("reply_markup")
    private Object replyMarkup;

}
