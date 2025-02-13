package com.azship.blip_state.services;

import com.azship.blip_state.domain.Message;
import com.azship.blip_state.domain.MessagesList;
import com.sun.source.tree.DoWhileLoopTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagesReceivedService {
    @Autowired
    private MessagesList messagesList;

    public String messagesReceived(String textMessage){
       messagesList.addMensagem(textMessage);
       if(messagesList.containsConfirmMessage()){
           return "Teste OK" + messagesList.getMensagesList().toString();
       } else {
           return messagesList.getMensagesList().toString();
       }
    }
}
