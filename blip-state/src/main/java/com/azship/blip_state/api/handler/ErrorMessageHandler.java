package com.azship.blip_state.api.handler;

import com.azship.blip_state.domain.exception.ErrorSendMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ErrorMessageHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ErrorSendMessage.class)
    public ResponseEntity<?> errorSendMessages(ErrorSendMessage exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
