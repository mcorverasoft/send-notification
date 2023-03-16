package hipotecario.com.sv.sendnotification.domain.interfaces;

import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationResponse;

public interface INotificationService {

    DTONotificationResponse sendNotification(Object notification);

}
