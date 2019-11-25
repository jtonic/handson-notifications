package ro.jtonic.handson.arch.hexagon.notifications.core;

import ro.jtonic.handson.arch.hexagon.notifications.core.api.EmailNotificationService;
import ro.jtonic.handson.arch.hexagon.notifications.core.model.EmailNotification;
import ro.jtonic.handson.arch.hexagon.notifications.core.spi.EmailNotificationRepository;

public class DefaultEmailNotificationService implements EmailNotificationService {

  private final EmailNotificationRepository repository;

  public DefaultEmailNotificationService(
      EmailNotificationRepository repository) {
    this.repository = repository;
  }

  @Override
  public void process(EmailNotification notification) {
    this.repository.save(notification);
  }
}
