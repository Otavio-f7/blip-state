package com.azship.blip_state.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Message {
    private boolean isStatusReply;
    private String senderLid;
    private String connectedPhone;
    private boolean waitingMessage;
    private boolean isEdit;
    private boolean isGroup;
    private boolean isNewsletter;
    private String instanceId;
    private String messageId;
    private String phone;
    private boolean fromMe;
    private long momment;
    private String status;
    private String chatName;
    private String senderPhoto;
    private String senderName;
    private String participantPhone;
    private String participantLid;
    private String photo;
    private boolean broadcast;
    private String type;
    private Text text;

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Text {
        private String message;
        private String descritpion;
        private String title;
        private String url;
        private String thumbnailUrl;
    }
}
