package com.azship.blip_state.client.dto;

public record DiscordMessageResponse(Boolean waiting,
                                     String thread_id) {
}
