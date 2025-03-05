package com.azship.blip_state.api.controller;

import com.azship.blip_state.domain.exception.ErrorSendMessage;
import com.azship.blip_state.domain.model.Message;
import com.azship.blip_state.domain.services.MessagesReceivedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/messages-received")
public class MessagesReceivedController {

    @Autowired
    private MessagesReceivedService messagesReceivedService;


    @PostMapping
    public String messagesReceived(@RequestBody Message body){
        messagesReceivedService.addMessagesReceived(body);
        return "Adcionada";

    }
}
