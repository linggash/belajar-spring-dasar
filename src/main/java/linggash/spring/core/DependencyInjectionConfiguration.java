package linggash.spring.core;

import linggash.spring.core.data.Bar;
import linggash.spring.core.data.Foo;
import linggash.spring.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    @Primary
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    // jika terdapat bean yang tidak unique maka kita dapat memilihnya secara spesifik
    // menggunakan annotation @Qualifier("namanya")

    @Bean
    public FooBar fooBar(
            @Qualifier("fooSecond") Foo foo,
            Bar bar
    ) {
        return new FooBar(foo, bar);
    }

}
