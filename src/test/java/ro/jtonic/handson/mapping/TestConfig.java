package ro.jtonic.handson.mapping;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = { NotificationMapperImpl.class })
public class TestConfig {
}
