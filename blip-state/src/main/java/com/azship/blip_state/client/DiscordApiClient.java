package com.azship.blip_state.client;

import com.azship.blip_state.client.dto.DiscordMessageRequest;
import com.azship.blip_state.client.dto.DiscordMessageResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name= "discord-api", url = "${discord.api-url}")
public interface DiscordApiClient {
    @PostMapping("${discord.webhook}")
    DiscordMessageResponse sendMessage(@RequestBody DiscordMessageRequest messageRequest);
}
