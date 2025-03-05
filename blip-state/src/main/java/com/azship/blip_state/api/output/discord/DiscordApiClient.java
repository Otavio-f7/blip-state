package com.azship.blip_state.api.output.discord;

import com.azship.blip_state.api.dto.DiscordMessageRequest;
import com.azship.blip_state.api.dto.DiscordMessageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name= "discord-api", url = "${discord.api-url}")
public interface DiscordApiClient {
    @PostMapping("${discord.webhook}")
    DiscordMessageResponse sendMessage(@RequestBody DiscordMessageRequest messageRequest);
}
