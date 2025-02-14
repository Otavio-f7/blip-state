package com.azship.blip_state.client.dto;

public record MockResponse(String requestId,
                           String items,
                           Integer count,
                           String anyKey) {
}
