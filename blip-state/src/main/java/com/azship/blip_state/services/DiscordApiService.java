package com.azship.blip_state.services;

import com.azship.blip_state.client.DiscordApiClient;
import com.azship.blip_state.client.dto.DiscordMessageRequest;
import com.azship.blip_state.client.dto.DiscordMessageResponse;
import com.azship.blip_state.client.dto.MockResponse;
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
