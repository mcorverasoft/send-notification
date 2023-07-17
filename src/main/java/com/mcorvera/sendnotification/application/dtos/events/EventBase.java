package com.mcorvera.sendnotification.application.dtos.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class EventBase<T> {
    private UUID id;
    private Instant date;
    private EvenType type;
    private T data;
}
