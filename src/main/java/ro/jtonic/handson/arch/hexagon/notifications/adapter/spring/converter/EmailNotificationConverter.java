package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.converter;

/**
 * use MapStruct mapper
 */
public interface EmailNotificationConverter<EmailNotification, EmailNotificationResponse> {

    EmailNotificationResponse convert(EmailNotification emailNotification);
}