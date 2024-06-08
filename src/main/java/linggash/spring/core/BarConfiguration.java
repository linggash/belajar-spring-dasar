package linggash.spring.core;

import linggash.spring.core.data.Bar;
import org.springframework.context.annotation.Bean;

public class BarConfiguration {

    @Bean
    public Bar bar() {
        return new Bar();
    }

}
