package com.mcorvera.sendnotification.application.restcontrollers;


import com.mcorvera.sendnotification.application.dtos.api.BaseResponse;
import com.mcorvera.sendnotification.domain.services.NotificationService;
import com.mcorvera.sendnotification.application.dtos.DTONotificationRequest;
import com.mcorvera.sendnotification.application.dtos.DTONotificationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController()
@RequestMapping("notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;
    @PostMapping
    public ResponseEntity<BaseResponse> sendNotification(@RequestBody DTONotificationRequest request) throws MessagingException {
        DTONotificationResponse response= notificationService.sendNotification(request);
        return ResponseEntity.ok(BaseResponse.builder().Response(response).build());
    }

}
