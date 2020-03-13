package ro.jtonic.handson.arch.hexagon.notifications.adapter.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.deleteit.Department;
import ro.jtonic.handson.arch.hexagon.notifications.adapter.spring.deleteit.Printable;

@SpringBootApplication(
    scanBasePackageClasses = Printable.class
)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	@ConditionalOnBean(Printable.class)
	public CommandLineRunner commandLineRunner(Department department) {
		return args -> department.printAll();
	}
}
