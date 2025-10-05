package com.ghost.gympro.dtos.projections;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SMSRequestDTO {

    @NotNull(message = "El campo destinatario es obligatorio")
    private String to;
    @NotNull(message = "El campo texto es obligatorio")
    private String text;
    private String customData;
    @Builder.Default
    private boolean isPremium = false;
    @Builder.Default
    private boolean isFlash = false;
    @Builder.Default
    private boolean isLongMessage = false;
    @Builder.Default
    private boolean isRandomRoute = false;
    private OffsetDateTime scheduledDate;


    public String getScheduledDate() {
        return this.scheduledDate != null ?
                scheduledDate.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME) : null;
    }
}

