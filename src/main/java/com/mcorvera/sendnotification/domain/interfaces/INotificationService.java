package com.mcorvera.sendnotification.domain.interfaces;

import com.mcorvera.sendnotification.application.dtos.DTONotificationRequest;
import com.mcorvera.sendnotification.application.dtos.DTONotificationResponse;

import javax.mail.MessagingException;

public interface INotificationService {
    DTONotificationResponse sendNotification(DTONotificationRequest notification) throws MessagingException;

}
