package ro.jtonic.handson.arch.hexagon.notifications.core.spi;

import ro.jtonic.handson.arch.hexagon.notifications.core.model.EmailNotification;

public interface EmailNotificationRepository {

    void save(EmailNotification notification);
}