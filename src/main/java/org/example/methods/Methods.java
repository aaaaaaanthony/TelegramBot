package org.example.methods;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.http.ContentType;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.example.HttpClient;
import org.example.entity.BotCommand;
import org.example.entity.MenuButtonDefault;
import org.example.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methods extends Config{

    /**
     * 获取个人信息
     * A simple method for testing your bot's authentication token. Requires no parameters. Returns basic information about the bot in form of a User object.
     * 简单的测试机器人的token,没有参数,返回的是关于机器人的信息,实体类是:{@link org.example.entity.User}
     */
    public static void getMe(){
        String method = "getMe";
        String result = HttpClient.post(method, null);
        JSONObject entries = JSONUtil.parseObj(result);
        Boolean ok = entries.getBool("ok");
        if (!ok) {
            Console.error("发送请求报错,方式是:{},报错详情:{}", method, result);
        }else {
            result = entries.getObj("result").toString();
            User bean = JSONUtil.toBean(result, User.class);
            System.out.println(bean);
        }
    }

    // TODO 未实现
    public static void logOut(){}

    // TODO 未实现
    public static void close(){}

    /**
     * 发送消息文本消息
     * Use this method to send text messages. On success, the sent Message is returned.
     * 使用这个方法发送文本消息,如果发送成功,返回{@link org.example.entity.Message}
     *
     * chat_id的获取方法: 调用getUpdates方法,给机器人发个消息,就会有了
     * {
     *   "ok": true,
     *   "result": [
     *     {
     *       "update_id": xxxxx,
     *       "message": {
     *         "message_id": xxxxx,
     *         "from": {
     *           "id": xxxxx,
     *           "is_bot": false,
     *           "first_name": "xxxxx",
     *           "username": "xxxxx",
     *           "language_code": "zh-hans"
     *         },
     *         "chat": {
     *           // chat_id
     *           "id": xxxxx,
     *           "first_name": "xxxxx",
     *           "username": "xxxxx",
     *           "type": "private"
     *         },
     *         "date": xxxxx,
     *         "text": "23"
     *       }
     *     }
     *   ]
     * }
     */
    public static void sendMessage(){
        Map<String, Object> map = new HashMap<>();
        map.put("chat_id", BOT_CHAT_ID);
        map.put("text", "https://baidu.com");

        String method = "sendMessage";
        String result = HttpClient.post(method, map);
        JSONObject entries = JSONUtil.parseObj(result);
        Boolean ok = entries.getBool("ok");
        if (!ok) {
            Console.error("发送请求报错,方式是:{},报错详情:{}", method, result);
        }else {
            result = entries.getObj("result").toString();
            User bean = JSONUtil.toBean(result, User.class);
            System.out.println(bean);
        }
    }


    public static void sendMessage(String text){

        String methodName = "/sendMessage";

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("chat_id", BOT_CHAT_ID);
        objectObjectsHashMap.put("text", text);

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(objectObjectsHashMap)
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);

    }


    // Formatting options
    // TODO 没实现


    /**
     * 转发消息
     * Use this method to forward messages of any kind. Service messages can't be forwarded. On success, the sent Message is returned.
     * 使用这个方法可以转发任何消息, 服务消息不能转发, 转发成功之后,返回{@link org.example.entity.Message}
     */
    public static void forwardMessage(){
        String methodName = "/forwardMessage";

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("chat_id", BOT_CHAT_ID);
        objectObjectsHashMap.put("from_chat_id", "569079805");
        objectObjectsHashMap.put("message_id", "132");

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(objectObjectsHashMap)
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);

    }

    /**
     * 复制消息
     * Use this method to copy messages of any kind. Service messages and invoice messages can't be copied. A quiz poll can be copied only if the value of the field correct_option_id is known to the bot.
     * The method is analogous to the method forwardMessage, but the copied message doesn't have a link to the original message. Returns the MessageId of the sent message on success.
     *
     * 使用这个方法拷贝任何消息,服务消息和发票消息不能拷贝,只有当机器人知道correct_option_id的值的时候 quiz poll可以拷贝,这方法类似转发消息,但是拷贝消息不能链接原来的消息,返回{@link org.example.entity.MessageId}
     *
     * TODO 发票消息?quiz poll?
     * 返回数据{"ok":true,"result":{"message_id":134}},message_id是最新的消息ID
     */
    public static void copyMessage(){
        String methodName = "/copyMessage";

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("chat_id", BOT_CHAT_ID);
        objectObjectsHashMap.put("from_chat_id", "569079805");
        objectObjectsHashMap.put("message_id", "132");

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(objectObjectsHashMap)
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);
    }


    /**
     * 发送图片
     * Use this method to send photos. On success, the sent Message is returned.
     * 使用这个方法发送图片,成功之后,会返回{@link org.example.entity.Message}
     */
    public static void sendPhoto(){
        String methodName = "/sendPhoto";

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("chat_id", BOT_CHAT_ID);
        objectObjectsHashMap.put("photo", FileUtil.file("/Users/anthony/Desktop/test.jpeg"));

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.CONTENT_TYPE,ContentType.MULTIPART.getValue())
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(objectObjectsHashMap)
                .timeout(90000)//超时，毫秒
                .execute().body();
        Console.log(result2);
    }

    // 还有好几个发送媒体文件的先不接了


    /**
     * Use this method to send a native poll. On success, the sent Message is returned.
     * 使用这个方法,发起本地投票,成功之后,会返回 {@link org.example.entity.Message}
     */
    public static void sendPoll(){
        String methodName = "/sendPoll";

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("chat_id", BOT_CHAT_ID);
        objectObjectsHashMap.put("question", "可以测试了吗");
        objectObjectsHashMap.put("options", JSONUtil.toJsonStr(new String[]{"可以","不可以"}));

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(objectObjectsHashMap)
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);
    }

    /**
     * Use this method to send an animated emoji that will display a random value. On success, the sent Message is returned.
     * 使用这个方法,发送动画Emoji 并展示随机数,成功之后,会返回 {@link org.example.entity.Message}
     */
    public static void sendDice(){
        String methodName = "/sendDice";

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("chat_id", BOT_CHAT_ID);

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(objectObjectsHashMap)
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);
    }

    /**
     * 发送聊天状态
     * Use this method when you need to tell the user that something is happening on the bot's side.
     * The status is set for 5 seconds or less (when a message arrives from your bot, Telegram clients clear its typing status). Returns True on success.
     * 使用这个方法告诉用户 一些事情正在发生
     * 这个状态是设置5s 后者跟短(到一个消息到达你的机器人,telegram客户端清理打字状态)
     *
     */
    public static void sendChatAction() {
        String methodName = "/sendChatAction";

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("chat_id", BOT_CHAT_ID);
        objectObjectsHashMap.put("action", "typing");

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(objectObjectsHashMap)
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);
    }

    /**
     * 获取用户图片
     * Use this method to get a list of profile pictures for a user. Returns a UserProfilePhotos object.
     * 使用这个方法获取一个用户的资料图片列表,返回{@link org.example.entity.UserProfilePhotos}
     */
    public static void getUserProfilePhotos() {

        String methodName = "/getUserProfilePhotos";

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("user_id", BOT_CHAT_ID);

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(objectObjectsHashMap)
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);
    }


    // getFile 没接

    /**
     * Use this method to get the number of members in a chat. Returns Int on success.
     * 使用这个方法,获取成员的数量,成功返回int数据
     */
    public static void getChatMemberCount() {

        String methodName = "/getChatMemberCount";

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("chat_id", BOT_CHAT_ID);

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .form(objectObjectsHashMap)
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);
    }


    /**
     * Use this method to get information about a member of a chat. The method is only guaranteed to work for other users if the bot is an administrator in the chat. Returns a ChatMember object on success.
     * 使用这个方法获取用户信息,只有当机器人是管理员的时候,才能获取
     */
    public static void getChatMember() {
    }

    public static void answerCallbackQuery() {
    }

    /**
     * 设置机器人自己的菜单命令
     * Use this method to change the list of the bot's commands. See this manual for more details about bot commands. Returns True on success.
     * 使用这个方法,改变 机器人的菜单命令,详情访问 https://core.telegram.org/bots/features#commands,成功返回True
     */
    public static void setMyCommands() {
        String methodName = "/setMyCommands";

        // 命令
        List<BotCommand> list = new ArrayList<>();

        BotCommand botCommand = new BotCommand();
        botCommand.setCommand("/begin");
        botCommand.setDescription("/开始");

        BotCommand botCommand2 = new BotCommand();
        botCommand2.setCommand("/end");
        botCommand2.setDescription("/结束");

        list.add(botCommand);
        list.add(botCommand2);

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("commands", list);

        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
//                .form(objectObjectsHashMap)
                .body(JSONUtil.toJsonStr(objectObjectsHashMap))
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);


    }

    /**
     * 设置机器人自己的菜单命令
     * Use this method to change the list of the bot's commands. See this manual for more details about bot commands. Returns True on success.
     * 使用这个方法,改变 机器人的菜单命令,详情访问 https://core.telegram.org/bots/features#commands,成功返回True
     * TODO 没实现
     */
    public static void setChatMenuButton() {
        String methodName = "/setChatMenuButton";


        MenuButtonDefault menuButtonDefault = new MenuButtonDefault();
        menuButtonDefault.setType("OKKKKKKKK");

        Map<String, Object> objectObjectsHashMap = new HashMap<>();
        objectObjectsHashMap.put("chat_id", BOT_CHAT_ID);
//        objectObjectsHashMap.put("menu_button", menuButtonDefault);


        String result2 = HttpRequest.post("https://api.telegram.org/bot" + BOT_TOKEN + methodName)
                .header(Header.USER_AGENT, "Hutool http")//头信息，多个头信息多次调用此方法即可
                .body(JSONUtil.toJsonStr(objectObjectsHashMap))
                .timeout(20000)//超时，毫秒
                .execute().body();
        Console.log(result2);


    }



}
