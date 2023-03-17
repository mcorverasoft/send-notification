package hipotecario.com.sv.sendnotification.domain.interfaces;

import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationRequest;
import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationResponse;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

@Component
public interface INotification {
    DTONotificationResponse sendNotification(DTONotificationRequest request) throws MessagingException;
}
