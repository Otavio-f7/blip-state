package com.azship.blip_state.controller;

import com.azship.blip_state.client.dto.MockResponse;
import com.azship.blip_state.services.DiscordApiService;
import com.azship.blip_state.services.MessagesReceivedService;
import com.azship.blip_state.services.ZApiService;
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
public class MessageFlowController {

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
            log.info("Messagens: {}", messagesReceivedService.toString());
            log.info("String não encontrada, chamaria a api");

        }
        try {
            LocalDateTime now = LocalDateTime.now();
            String formatedNow = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            MockResponse response = zApiService.sendMessage(formatedNow);
            log.info("Resposta da API: {}", response.anyKey());
        } catch (Exception e) {
            log.error("Erro ao chamar a API:", e);
        }



    }
}
