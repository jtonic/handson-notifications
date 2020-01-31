package ro.jtonic.handson.arch.hexagon.notifications.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.converter.EmailNotificationConverter;
import ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.converter.EmailNotificationConverterImpl;
import ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.rest.dto.EmailNotificationResponse;
import ro.jtonic.handson.arch.hexagon.notifications.core.model.EmailNotification;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {EmailNotificationConverterImpl.class})
class ConversionInApplicationContextTest {

  @Autowired
  private EmailNotificationConverter converter;
  
  @Test
  void contextLoads() {
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
