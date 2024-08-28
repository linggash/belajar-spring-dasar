package linggash.spring.core;

import linggash.spring.core.data.Bar;
import linggash.spring.core.data.Foo;
import linggash.spring.core.data.FooBar;
import linggash.spring.core.data.MultiFoo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import java.util.Optional;

@Configuration
@Import(MultiFoo.class)
public class OptionalConfiguration {

    @Bean
    @Primary
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }

    @Bean
    public Foo foo3() {
        return new Foo();
    }

    // Untuk dependency yang tidak wajib kita bisa menggunakan java.util.Opptional<T> pada parameternya
    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
