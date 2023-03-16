package hipotecario.com.sv.sendnotification.application.restcontrollers;


import hipotecario.com.sv.sendnotification.application.dtos.DTONotificationRequest;
import hipotecario.com.sv.sendnotification.application.dtos.api.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("api/notification")
public class NotificationController {

    @PostMapping
    public ResponseEntity<BaseResponse> sendNotification(@RequestBody DTONotificationRequest request){

        System.out.println(request);
        return ResponseEntity.ok(BaseResponse.builder().build());
    }

}
