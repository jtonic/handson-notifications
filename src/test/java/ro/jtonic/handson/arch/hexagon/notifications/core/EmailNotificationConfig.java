package ro.jtonic.handson.arch.hexagon.notifications.core;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import ro.jtonic.handson.arch.hexagon.notifications.core.api.DefaultEmailNotificationService;
import ro.jtonic.handson.arch.hexagon.notifications.core.api.EmailNotificationService;
import ro.jtonic.handson.arch.hexagon.notifications.core.spi.EmailNotificationRepository;

@TestConfiguration
public class EmailNotificationConfig {

    @Bean
    public EmailNotificationService emailNotificationService(EmailNotificationRepository repository) {
        return new DefaultEmailNotificationService(repository);
    }

    @Bean
    public EmailNotificationRepository emailNotificationRepository() {
        return notification -> System.out.println("Saving....");
    }
}
