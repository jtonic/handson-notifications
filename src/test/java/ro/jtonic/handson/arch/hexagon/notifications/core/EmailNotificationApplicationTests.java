package ro.jtonic.handson.arch.hexagon.notifications.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ro.jtonic.handson.arch.hexagon.notifications.core.api.EmailNotificationService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {EmailNotificationConfig.class})
class EmailNotificationApplicationTests {

  @Autowired
  private EmailNotificationService notificationService;
  
  @Autowired
  private ApplicationContext ctx;
  
  @Test
  void contextLoads() {
    assertNotNull(ctx);
    assertNotNull(notificationService);
  }
}
