package com.ghost.gympro.dtos.projections;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SMSResponseDTO {
    private Integer statusCode;
    private String statusMessage;
    private String MessageId;
    private List<MessageInfo> MessageInfo;


    public SMSResponseDTO(Integer statusCode, String statusMessage, String messageId) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
        MessageId = messageId;
    }

    public SMSResponseDTO(Integer statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static class MessageInfo {
        private String recipient;
        private String messageId;
    }
}
