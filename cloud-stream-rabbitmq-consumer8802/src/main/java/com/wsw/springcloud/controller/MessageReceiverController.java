package com.wsw.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Author WangSongWen
 * @Date: Created in 13:40 2020/10/21
 * @Description: 消息 消费者1
 */
@Component
@EnableBinding(Sink.class)
@Slf4j
public class MessageReceiverController {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void MessageReceive(Message<String> message){
        log.info("消费者1接受到消息: " + message.getPayload() + " serverPort: " + serverPort);
    }
}
