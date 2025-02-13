package com.azship.blip_state.client;

import com.azship.blip_state.client.dto.SendMessageRequest;
import com.azship.blip_state.client.dto.SendMessageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "z-api", url
        = "${z.api-url}")
public interface ZApiClient {

    @PostMapping("send-text")
    SendMessageResponse sendMessage(@RequestBody SendMessageRequest sendMessageRequest);
    //@RequestHeader("ClientToken") String clientToken);
}

