package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.rest.dto.EmailNotificationRequest;

@RequestMapping("/notifications")
public class EmailNotificationController {

    private final EmailNotificationAdapter adapter;

    public EmailNotificationController(EmailNotificationAdapter adapter) {
        this.adapter = adapter;
    }

    @PostMapping
    public void process(@RequestBody EmailNotificationRequest request) {
        this.adapter.process(request);
    }
}
