package com.mcorvera.sendnotification.domain.interfaces;

import com.mcorvera.sendnotification.application.dtos.DTONotificationRequest;
import com.mcorvera.sendnotification.application.dtos.DTONotificationResponse;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Component
public interface INotification {
    DTONotificationResponse sendNotification(DTONotificationRequest request);
}
