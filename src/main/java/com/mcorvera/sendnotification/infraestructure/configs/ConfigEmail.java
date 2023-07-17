package com.mcorvera.sendnotification.infraestructure.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

@Configuration
public class ConfigEmail {
    @Value("${application.mail.smtp.auth}")
    private boolean auth;
    @Value("${application.mail.smtp.starttls.enable}")
    private String starttls;
    @Value("${application.mail.smtp.host}")
    private String host;
    @Value("${application.mail.smtp.port}")
    private int port;
    @Value("${application.mail.smtp.ssl.trust}")
    private String ssl;
    @Value("${application.mail.smtp.user}")
    private String userAccount;
    @Value("${application.mail.smtp.user.password}")
    private String passwordAccount;
    @Value("${application.mail.smtp.ssl.enable}")
    private String sslEnable;

    @Bean
    public Session getSession() {
        Session session = Session.getInstance(this.configutationEmail(), new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userAccount, passwordAccount);
            }
        });
        return session;
    }

    private Properties configutationEmail(){
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", auth);
        //prop.put("mail.smtp.starttls.enable", starttls);
        prop.put("mail.smtp.ssl.enable", sslEnable);
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.port", port);
        //prop.put("mail.smtp.ssl.trust", host);
        return prop;
    }

}
