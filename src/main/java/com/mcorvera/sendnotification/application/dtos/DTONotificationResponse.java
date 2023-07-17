package com.mcorvera.sendnotification.application.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class DTONotificationResponse {
    @Builder.Default
    private String message="";
}
