package hipotecario.com.sv.sendnotification.domain.interfaces;

import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationRequest;
import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationResponse;

import javax.mail.MessagingException;

public interface INotificationService {
    DTONotificationResponse sendNotification(DTONotificationRequest notification) throws MessagingException;

}
