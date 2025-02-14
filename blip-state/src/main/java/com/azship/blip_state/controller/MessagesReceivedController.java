package com.azship.blip_state.controller;

import com.azship.blip_state.domain.Message;
import com.azship.blip_state.services.MessagesReceivedService;
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
        try{
        messagesReceivedService.addMessagesReceived(body);
        return "Adcionada";
        } catch (Exception e){
            log.error("Erro ao adicionar na lista: ", e);
            return "Erro";
        }
    }
}
