package com.mcorvera.sendnotification.application.consumers;


import com.mcorvera.sendnotification.domain.interfaces.INotification;
import com.mcorvera.userservice.infraestructure.dtos.events.EventBase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Slf4j
@RequiredArgsConstructor
@Component
public class ConsumerUserEvent {

    private final INotification notification;
    //@Value("${spring.kafka.topic}")
    //private final String topic;
    @KafkaListener(
            topics = "${spring.kafka.template-default-topic}")
    public void consumer(EventBase eventUser) {

        log.info(eventUser.getData().toString());

    }

    /*public void consumer(String eventUser) {
        EventUser user=null;
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        try {
             user=objectMapper.readValue(eventUser,EventUser.class);
            DTONotificationRequest notificationRequest= DTONotificationRequest.builder()
                    .code("TEMPLATE-1")
                    .data(new HashMap<>())
                    .to(Arrays.asList(user.getData().getEmail()))
                    .build();
            notification.sendNotification(notificationRequest);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        log.info(eventUser);

    }*/
}
