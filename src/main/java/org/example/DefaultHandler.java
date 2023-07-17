package org.example;

import cn.hutool.json.JSONUtil;
import org.example.client.AbstractHandle;
import org.example.entity.Message;
import org.example.entity.Update;

import java.util.List;

/**
 * 默认的处理器
 */
public class DefaultHandler extends AbstractHandle {

    @Override
    protected void handler(Update update) {
        System.out.println("接受到消息了" + update);
    }
}
