package org.example.client;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Message;
import org.example.entity.Update;

import java.util.List;

/**
 * 抽象处理器
 */
@Slf4j
public abstract class AbstractHandle {

    protected void handler(String responseBody) {
        System.out.println(responseBody);
        JSONObject entries = JSONUtil.parseObj(responseBody);
        Boolean ok = entries.getBool("ok");
        // 判断状态请求是否成功
        if (ok) {

            // 判断是否有数据
            JSONArray result = entries.getJSONArray("result");
            int size = result.size();
            if (size == 0) { // 没有新的消息

            }else {
                List<Update> list = JSONUtil.toList(result.toString(), Update.class);
                list.forEach(this::handler);
            }
        }else {
            log.warn("请求报错:{}", responseBody);
        }
    }

    protected abstract void handler(Update message);
}
