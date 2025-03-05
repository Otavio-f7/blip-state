package com.azship.blip_state.domain.services;

import com.azship.blip_state.api.output.zapi.ZApiClient;
import com.azship.blip_state.api.dto.MockResponse;
import com.azship.blip_state.api.dto.SendMessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZApiService {

    //@Value("${z.api-client-token}")
    //private String clientToken;



    private final ZApiClient zApiClient;

    public MockResponse sendMessage(String time){
        SendMessageRequest sendMessageRequest = new SendMessageRequest("3499999", "Teste blip API em " + time);
        MockResponse response = zApiClient.sendMessage(sendMessageRequest);
        System.out.println("ID da mensagem: " + response.items());
        return response;
    }

}
