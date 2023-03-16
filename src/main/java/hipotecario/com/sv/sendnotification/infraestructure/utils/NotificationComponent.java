package hipotecario.com.sv.sendnotification.infraestructure.utils;

import hipotecario.com.sv.sendnotification.domain.interfaces.INotification;
import org.springframework.stereotype.Component;

@Component
public class NotificationComponent implements INotification {
    boolean sendMessage(){
        return false;
    }
}
