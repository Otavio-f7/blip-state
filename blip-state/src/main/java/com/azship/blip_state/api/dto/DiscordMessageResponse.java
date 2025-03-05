package com.azship.blip_state.api.dto;

public record DiscordMessageResponse(Boolean waiting,
                                     String thread_id) {
}
