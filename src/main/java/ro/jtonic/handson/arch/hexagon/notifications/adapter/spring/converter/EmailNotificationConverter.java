package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.converter;

import org.mapstruct.Mapper;
import ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.rest.dto.EmailNotificationResponse;
import ro.jtonic.handson.arch.hexagon.notifications.core.model.EmailNotification;

/**
 * use MapStruct mapper
 */
@Mapper
public interface EmailNotificationConverter {

    EmailNotificationResponse convert(EmailNotification emailNotification);
}