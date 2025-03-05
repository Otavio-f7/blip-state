package com.azship.blip_state.domain.services;

import com.azship.blip_state.api.output.discord.DiscordApiClient;
import com.azship.blip_state.api.dto.DiscordMessageRequest;
import com.azship.blip_state.api.dto.DiscordMessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscordApiService {

    @Autowired
    private DiscordApiClient discordApiClient;

    public DiscordMessageResponse sendMessage(){
        DiscordMessageRequest messageRequest = new DiscordMessageRequest("Alerta, Blip com mau funcionamento!");
        DiscordMessageResponse response = discordApiClient.sendMessage(messageRequest);
        return  response;

    }
}
