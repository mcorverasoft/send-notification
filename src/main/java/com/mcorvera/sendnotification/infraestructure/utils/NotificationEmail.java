package com.mcorvera.sendnotification.infraestructure.utils;


import com.mcorvera.sendnotification.application.dtos.DTONotificationRequest;
import com.mcorvera.sendnotification.application.dtos.DTONotificationResponse;
import com.mcorvera.sendnotification.domain.interfaces.INotification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.concurrent.atomic.AtomicReference;


@Component
@Primary
public class NotificationEmail implements INotification {
    @Autowired
    private Session session;
    @Override
    public DTONotificationResponse sendNotification(DTONotificationRequest request) {
        AtomicReference<MessagingException> messagingException=new AtomicReference<>();
        request.to.stream().parallel().forEach(email->{
                try{
                    MimeMessage message = new MimeMessage(this.session);
                    message.setFrom(new InternetAddress("milton.corvera.ing@gmail.com"));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
                    message.setSubject("Example Email (Test), No reply");
                    message.setContent("<h1>Hello World</h1>", "text/html");
                    Transport.send(message);
                }catch (MessagingException me){
                    messagingException.set(me);
                }
        });

        return DTONotificationResponse
                .builder()
                .message("Email Send to: "+request.to)
                .build();
    }





}
