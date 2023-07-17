package com.mcorvera.userservice.infraestructure.dtos.events;

import com.mcorvera.sendnotification.domain.model.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EventUser extends EventBase<User> {
}
