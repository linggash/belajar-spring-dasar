package linggash.spring.core;

import linggash.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    // scope digunakan untuk menentukan bean tersebut masuk kedalam scope apa.
    // secara default bean akan dibuat secara singleton

    @Bean
    @Scope("prototype")
    public Foo foo() {
        log.info("created foo");
        return new Foo();
    }
}
