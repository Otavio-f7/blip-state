package com.azship.blip_state.services;

import com.azship.blip_state.domain.Message;
import com.azship.blip_state.domain.MessagesList;
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

        if (message.getPhone().equals(validPhone)){
            messagesList.addMensagem(message.getText().getMessage());
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

    public List getList(){
        List list = messagesList.getMensagesList();
        return list;
    }
}
