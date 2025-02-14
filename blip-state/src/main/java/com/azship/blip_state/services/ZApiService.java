package com.azship.blip_state.services;

import com.azship.blip_state.client.ZApiClient;
import com.azship.blip_state.client.dto.MockResponse;
import com.azship.blip_state.client.dto.SendMessageRequest;
import com.azship.blip_state.client.dto.SendMessageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

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
