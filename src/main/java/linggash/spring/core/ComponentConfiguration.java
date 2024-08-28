package linggash.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "linggash.spring.core.service",
        "linggash.spring.core.repository"
})
public class ComponentConfiguration {
}
