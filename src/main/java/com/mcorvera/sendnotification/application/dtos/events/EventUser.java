package com.mcorvera.sendnotification.application.dtos.events;

import com.mcorvera.sendnotification.domain.model.User;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EventUser extends EventBase<User>{
}
