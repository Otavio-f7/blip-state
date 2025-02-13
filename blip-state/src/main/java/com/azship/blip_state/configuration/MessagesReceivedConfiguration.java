package com.azship.blip_state.configuration;

import com.azship.blip_state.domain.MessagesList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class MessagesReceivedConfiguration {

    @Bean
    public MessagesList myService(){
        return new MessagesList(new ArrayList<>());
    }
}
