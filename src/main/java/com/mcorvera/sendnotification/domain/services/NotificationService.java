package com.mcorvera.sendnotification.domain.services;

import com.mcorvera.sendnotification.domain.interfaces.INotification;
import com.mcorvera.sendnotification.domain.interfaces.INotificationService;
import com.mcorvera.sendnotification.application.dtos.DTONotificationRequest;
import com.mcorvera.sendnotification.application.dtos.DTONotificationResponse;
import com.mcorvera.sendnotification.infraestructure.utils.NotificationFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
@RequiredArgsConstructor
public class NotificationService implements INotificationService {

    private final INotification notification;
    @Override
    public DTONotificationResponse sendNotification(DTONotificationRequest request) throws MessagingException {
        NotificationFactory sender=new NotificationFactory(notification);
        return sender.sendNotification(request);
    }
}
