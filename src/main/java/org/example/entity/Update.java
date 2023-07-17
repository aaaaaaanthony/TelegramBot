package org.example.entity;

import cn.hutool.core.annotation.Alias;
import lombok.Data;

@Data
public class Update {
    /**
     * The update's unique identifier.
     * Update identifiers start from a certain positive number and increase sequentially.
     * This ID becomes especially handy if you're using webhooks,
     * since it allows you to ignore repeated updates or to restore the correct update sequence,
     * should they get out of order.
     * If there are no new updates for at least a week,
     * then identifier of the next update will be chosen randomly instead of sequentially.
     */
    private int updateId;

    /**
     * New incoming message of any kind - text, photo, sticker, etc.
     */
    private Message message;

    /**
     * New version of a message that is known to the bot and was edited.
     */
    private Message editedMessage;

    /**
     * New incoming channel post of any kind - text, photo, sticker, etc.
     */
    private Message channelPost;

    /**
     * New version of a channel post that is known to the bot and was edited.
     */
    private Message editedChannelPost;

    /**
     * New incoming inline query.
     */
    private InlineQuery inlineQuery;

    /**
     * The result of an inline query that was chosen by a user and sent to their chat partner.
     */
    private ChosenInlineResult chosenInlineResult;

    /**
     * New incoming callback query.
     */
    private CallbackQuery callbackQuery;

    /**
     * New incoming shipping query. Only for invoices with flexible price.
     */
    private ShippingQuery shippingQuery;

    /**
     * New incoming pre-checkout query. Contains full information about checkout.
     */
    private PreCheckoutQuery preCheckoutQuery;

    /**
     * New poll state. Bots receive only updates about stopped polls and polls, which are sent by the bot.
     */
    private Poll poll;

    /**
     * A user changed their answer in a non-anonymous poll.
     * Bots receive new votes only in polls that were sent by the bot itself.
     */
    private PollAnswer pollAnswer;

    /**
     * The bot's chat member status was updated in a chat.
     * For private chats, this update is received only when the bot is blocked or unblocked by the user.
     */
    private ChatMemberUpdated myChatMember;

    /**
     * A chat member's status was updated in a chat.
     * The bot must be an administrator in the chat and must explicitly specify “chat_member” in the list of allowed_updates to receive these updates.
     */
    private ChatMemberUpdated chatMember;

    /**
     * A request to join the chat has been sent.
     * The bot must have the can_invite_users administrator right in the chat to receive these updates.
     */
    private ChatJoinRequest chatJoinRequest;

    // You can also add custom methods and additional fields as per your requirements
}

