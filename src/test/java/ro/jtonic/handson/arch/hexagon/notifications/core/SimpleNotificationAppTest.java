package ro.jtonic.handson.arch.hexagon.notifications.core;

import java.util.function.Consumer;
import org.junit.jupiter.api.Test;
import ro.jtonic.handson.arch.hexagon.notifications.core.api.EmailNotificationService;
import ro.jtonic.handson.arch.hexagon.notifications.core.model.EmailNotification;
import ro.jtonic.handson.arch.hexagon.notifications.core.spi.EmailNotificationRepository;

public class SimpleNotificationAppTest {

  @Test
  void testTheHexagon() {
    final EmailNotificationRepository repository = notification -> System.out.printf("Saving %s", notification.getName());
    final EmailNotificationService emailNotificationService = new DefaultEmailNotificationService(
        repository);
    final EmailNotification emailNotification = new EmailNotification("email notification", "email", "processed");
    final var driverAdapter = new SimpleDriverAdapter(emailNotificationService);
    driverAdapter.accept(emailNotification);
  }

  static final class SimpleDriverAdapter implements Consumer <EmailNotification>{
    private final EmailNotificationService service;

    SimpleDriverAdapter(
        EmailNotificationService service) {
      this.service = service;
    }

    @Override
    public void accept(EmailNotification emailNotification) {
      service.process(emailNotification);
    }
  }
}
