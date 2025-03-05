package com.azship.blip_state.domain.services;

import com.azship.blip_state.domain.exception.ErrorSendMessage;
import com.azship.blip_state.domain.model.Message;
import com.azship.blip_state.domain.model.MessagesList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagesReceivedService {
    @Autowired
    private MessagesList messagesList;

    @Value("${valid-phone}")
    private String validPhone;


    public void addMessagesReceived(Message message){
        try {
            if (message.getPhone().equals(validPhone)) {
                messagesList.addMensagem(message.getText().getMessage());
            }
        } catch (Exception e) {
            throw new ErrorSendMessage("Error send message");
        }
    }

    public boolean validMessage(){
        if(messagesList.containsConfirmMessage()){
            return true;
        } else {
            return false;
        }
    }

    public void cleanMessagesList(){
        messagesList.clenMessages();
    }

}
