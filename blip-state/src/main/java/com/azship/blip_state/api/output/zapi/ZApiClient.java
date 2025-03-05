package com.azship.blip_state.api.output.zapi;

import com.azship.blip_state.api.dto.MockResponse;
import com.azship.blip_state.api.dto.SendMessageRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "z-api", url
        = "${z.api-url}")
public interface ZApiClient {

    @PostMapping("send-text")
    MockResponse sendMessage(@RequestBody SendMessageRequest sendMessageRequest);
    //@RequestHeader("ClientToken") String clientToken);
}

