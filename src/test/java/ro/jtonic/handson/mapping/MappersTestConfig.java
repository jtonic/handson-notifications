package ro.jtonic.handson.mapping;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(useDefaultFilters = false,
    basePackages = { "ro.jtonic.handson" },
    includeFilters = @Filter(type = FilterType.REGEX, pattern="ro.jtonic.handson.*.*MapperImpl")
)
public class MappersTestConfig {

}
