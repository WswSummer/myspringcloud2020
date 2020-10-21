package com.wsw.springcloud.service.impl;

import com.wsw.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;


import java.util.UUID;

/**
 * @Author WangSongWen
 * @Date: Created in 11:03 2020/10/21
 * @Description: 消息 生产者
 */
@EnableBinding(Source.class)  // 消息的推送管道
@Slf4j
public class MessageProviderImpl implements IMessageProvider {
    @Autowired
    private MessageChannel output;  // 消息发送管道

    @Override
    public void send() {
        String serial = UUID.randomUUID().toString();
        Message<String> message = MessageBuilder.withPayload(serial).build();
        output.send(message);
        log.info("serial: " + serial);
    }
}
