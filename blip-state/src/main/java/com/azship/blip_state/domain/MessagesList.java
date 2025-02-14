package com.azship.blip_state.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class MessagesList {
    private List<String> mensagesList;

    public void addMensagem(String mensagem) {
        mensagesList.add(mensagem);
    }

    public boolean containsConfirmMessage(){
        for (String message : mensagesList){
            if (message.contains("Teste AZ_Blip_Status_OK")){
                return true;
            }
        }
        return false;
    }

    public void clenMessages(){
        mensagesList.clear();
    }
}
