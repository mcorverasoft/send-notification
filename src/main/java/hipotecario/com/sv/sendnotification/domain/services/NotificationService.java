package hipotecario.com.sv.sendnotification.domain.services;

import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationRequest;
import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationResponse;
import hipotecario.com.sv.sendnotification.domain.interfaces.INotificationService;
import hipotecario.com.sv.sendnotification.infraestructure.utils.NotificationEmail;
import hipotecario.com.sv.sendnotification.infraestructure.utils.NotificationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class NotificationService implements INotificationService {

    @Autowired
    private NotificationEmail notificationEmail;
    @Override
    public DTONotificationResponse sendNotification(DTONotificationRequest request) throws MessagingException {
        NotificationFactory sender=new NotificationFactory(notificationEmail);
        return sender.sendNotification(request);
    }
}
