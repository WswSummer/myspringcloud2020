package com.wsw.springcloud.controller;

import com.wsw.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WangSongWen
 * @Date: Created in 11:11 2020/10/21
 * @Description:
 */
@RestController
public class SendMessageController {
    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping("/send")
    public void sendMessage(){
        messageProvider.send();
    }
}
