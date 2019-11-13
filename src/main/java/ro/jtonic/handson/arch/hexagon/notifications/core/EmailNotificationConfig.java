package ro.jtonic.handson.arch.hexagon.notifications.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ro.jtonic.handson.arch.hexagon.notifications.core.api.DefaultEmailNotificationService;
import ro.jtonic.handson.arch.hexagon.notifications.core.api.EmailNotificationService;
import ro.jtonic.handson.arch.hexagon.notifications.core.spi.EmailNotificationRepository;

@Configuration
public class EmailNotificationConfig {

    @Bean
    public EmailNotificationService emailNotificationService(EmailNotificationRepository repository) {
        return new DefaultEmailNotificationService(repository);
    }

    @Bean
    @Profile("mock")
    public EmailNotificationRepository emailNotificationRepository() {
        return notification -> System.out.println("Saving....");
    }
}