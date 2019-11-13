package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.rest;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.converter.EmailNotificationRequestConverter;
import ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.rest.dto.EmailNotificationRequest;
import ro.jtonic.handson.arch.hexagon.notifications.core.api.EmailNotificationService;
import ro.jtonic.handson.arch.hexagon.notifications.core.model.EmailNotification;

@Service
public class EmailNotificationAdapter {

    private final EmailNotificationService service;
    private final EmailNotificationRequestConverter<EmailNotificationRequest, EmailNotification> converter;

    public EmailNotificationAdapter(EmailNotificationService service,
            EmailNotificationRequestConverter<EmailNotificationRequest, EmailNotification> converter) {
        this.service = service;
        this.converter = converter;
    }

    @PostMapping
    public void process(@RequestBody EmailNotificationRequest cpReq) {
        EmailNotification ecp = this.converter.convert(cpReq);
        this.service.process(ecp);
    }
}