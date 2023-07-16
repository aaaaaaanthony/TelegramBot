package org.example.methods;

import org.example.entity.request.ReqForwardMessage;
import org.junit.jupiter.api.Test;

public class ForwardMessageTest {
    /**
     * 转发消息
     */
    @Test
    void forwardMessage(){
        ReqForwardMessage reqForwardMessage = new ReqForwardMessage();
        ForwardMessage.forwardMessage(reqForwardMessage);
    }
}
