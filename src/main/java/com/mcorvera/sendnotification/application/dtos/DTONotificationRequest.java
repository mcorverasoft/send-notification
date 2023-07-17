package com.mcorvera.sendnotification.application.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
@EqualsAndHashCode
public class DTONotificationRequest {
    public String code;
    public List<String> to;
    private Map<String, String> data=new HashMap<>();
}
