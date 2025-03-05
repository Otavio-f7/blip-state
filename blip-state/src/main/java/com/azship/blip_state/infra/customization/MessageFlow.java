package com.azship.blip_state.infra.customization;

import com.azship.blip_state.api.dto.MockResponse;
import com.azship.blip_state.domain.exception.ErrorSendMessage;
import com.azship.blip_state.domain.services.DiscordApiService;
import com.azship.blip_state.domain.services.MessagesReceivedService;
import com.azship.blip_state.domain.services.ZApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@EnableScheduling
@RequiredArgsConstructor
@Slf4j
public class MessageFlow {

    @Autowired
    private ZApiService zApiService;

    @Autowired
    private MessagesReceivedService messagesReceivedService;

    @Autowired
    private DiscordApiService discordApiService;


    @Scheduled(fixedRate = 60000)
    public void scheduledMessage() {
        if (messagesReceivedService.validMessage()){
            messagesReceivedService.cleanMessagesList();
        } else {
            messagesReceivedService.cleanMessagesList();
            //discordApiService.sendMessage();

        }
        try {
            LocalDateTime now = LocalDateTime.now();
            String formatedNow = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            MockResponse response = zApiService.sendMessage(formatedNow);
        } catch (Exception e) {
            throw new ErrorSendMessage("Error send message");
        }


    }
}
