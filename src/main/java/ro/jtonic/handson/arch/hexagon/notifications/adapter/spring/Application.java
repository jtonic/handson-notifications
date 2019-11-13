package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ro.jtonic.handson.arch.hexagon.notifications.core.EmailNotificationConfig;

@SpringBootApplication
@Import(EmailNotificationConfig.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
