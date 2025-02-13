package com.azship.blip_state.services;

import com.azship.blip_state.client.ZApiClient;
import com.azship.blip_state.client.dto.SendMessageRequest;
import com.azship.blip_state.client.dto.SendMessageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZApiService {

    //@Value("${z.api-client-token}")
    //private String clientToken;

    private ZApiClient zApiClient;

    public SendMessageResponse sendMessageResponse(){
        SendMessageRequest sendMessageRequest = new SendMessageRequest("3499999", "Teste blip API");
        return zApiClient.sendMessage(sendMessageRequest);
    }
}
