package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.rest.dto.EmailNotificationResponse;
import ro.jtonic.handson.arch.hexagon.notifications.core.model.EmailNotification;

class EmailNotificationConverterTest {

  @Test
  void convert() {
    EmailNotificationConverter converter = new EmailNotificationConverterImpl();
    final EmailNotification emailNotification = EmailNotification.builder()
        .name("jtonic")
        .type("email")
        .status("processed")
        .build();
    final EmailNotificationResponse response = converter
        .convert(emailNotification);
    assertEquals("jtonic", response.getName());
    assertEquals("email", response.getType());
    assertEquals("processed", response.getStatus());
  }
}
