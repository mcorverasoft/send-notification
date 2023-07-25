package com.mcorvera.sendnotification.application.consumers;


import com.mcorvera.sendnotification.application.dtos.DTONotificationRequest;
import com.mcorvera.sendnotification.domain.interfaces.INotification;
import com.mcorvera.sendnotification.domain.model.User;
import com.mcorvera.userservice.infraestructure.dtos.events.EventBase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import java.util.Arrays;
import java.util.HashMap;


@Slf4j
@RequiredArgsConstructor
@Component
public class ConsumerUserEvent {

    private final INotification notification;
    //@Value("${spring.kafka.topic}")
    //private final String topic;
    @KafkaListener(
            topics = "${spring.kafka.template-default-topic}", containerFactory="NotificationContainerFactory")
    public void consumer(@Payload EventBase<User> eventUser, Acknowledgment ack) {

        DTONotificationRequest notificationRequest= DTONotificationRequest.builder()
                .code("TEMPLATE-1")
                .data(new HashMap<>())
                .to(Arrays.asList(eventUser.getData().getEmail()))
                .build();
        notification.sendNotification(notificationRequest);
        ack.acknowledge();
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
