package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.converter;

/**
 * use MapStruct mapper
 */
public interface EmailNotificationRequestConverter<EmailNotificationRequest, EmailNotification> {

    EmailNotification convert(EmailNotificationRequest req);
}