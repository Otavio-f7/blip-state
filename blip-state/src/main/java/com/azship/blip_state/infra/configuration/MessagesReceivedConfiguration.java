package com.azship.blip_state.infra.configuration;

import com.azship.blip_state.domain.model.MessagesList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class MessagesReceivedConfiguration {

    @Bean
    public MessagesList MessagesListService(){
        return new MessagesList(new ArrayList<>(Arrays.asList("Teste AZ_Blip_Status_OK")));
    }
}
