package com.mcorvera.sendnotification.infraestructure.utils;

import com.mcorvera.sendnotification.application.dtos.DTONotificationRequest;
import com.mcorvera.sendnotification.application.dtos.DTONotificationResponse;
import com.mcorvera.sendnotification.domain.interfaces.INotification;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Component
public class NotificationFactory {
    private INotification iNotification;
    public NotificationFactory(INotification iNotification){
        this.iNotification=iNotification;
    }
    public DTONotificationResponse sendNotification(DTONotificationRequest request) throws MessagingException {
        return this.iNotification.sendNotification(request);
    }
}
