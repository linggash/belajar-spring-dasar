package linggash.spring.core;

import linggash.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    private static final Logger log = LoggerFactory.getLogger(BeanConfiguration.class);

    // bean adalah objek yang akan otomatis dibuat oleh spring saat program dijalankan
    // dan akan mengembalikan nilai sesuai dengan yang kita return.
    // bean ini bersifat singleton

    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Foo created");
        return foo;
    }
}
