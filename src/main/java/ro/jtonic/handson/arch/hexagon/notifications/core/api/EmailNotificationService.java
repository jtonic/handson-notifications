package ro.jtonic.handson.arch.hexagon.notifications.core.api;

import ro.jtonic.handson.arch.hexagon.notifications.core.model.EmailNotification;

public interface EmailNotificationService {

    void process(EmailNotification contactPoint);
}