package com.azship.blip_state.controller;

import com.azship.blip_state.domain.Message;
import com.azship.blip_state.services.MessagesReceivedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Key;
import java.util.Map;

@RestController
@RequestMapping("/messages-received")
public class MessagesReceivedController {

    @Autowired
    private MessagesReceivedService messagesReceivedService;


    @PostMapping
    public String messagesReceived(@RequestBody Message body){
        return messagesReceivedService.messagesReceived(body.getText().getMessage());
    }
}
