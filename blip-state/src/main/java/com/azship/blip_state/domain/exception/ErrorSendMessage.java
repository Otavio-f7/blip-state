package com.azship.blip_state.domain.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorSendMessage extends RuntimeException{

    public ErrorSendMessage(String message){
        super(message);
    }

}
