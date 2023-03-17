package hipotecario.com.sv.sendnotification.infraestructure.utils;

import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationRequest;
import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationResponse;
import hipotecario.com.sv.sendnotification.domain.interfaces.INotification;
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
