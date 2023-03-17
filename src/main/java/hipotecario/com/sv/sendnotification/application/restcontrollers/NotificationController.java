package hipotecario.com.sv.sendnotification.application.restcontrollers;


import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationRequest;
import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationResponse;
import hipotecario.com.sv.sendnotification.application.dtos.api.BaseResponse;
import hipotecario.com.sv.sendnotification.domain.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController()
@RequestMapping("api/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;
    @PostMapping
    public ResponseEntity<BaseResponse> sendNotification(@RequestBody DTONotificationRequest request) throws MessagingException {
        DTONotificationResponse response= notificationService.sendNotification(request);
        return ResponseEntity.ok(BaseResponse.builder().Response(response).build());
    }

}
