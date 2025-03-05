package com.azship.blip_state.api.dto;

public record MockResponse(String requestId,
                           String items,
                           Integer count,
                           String anyKey) {
}
