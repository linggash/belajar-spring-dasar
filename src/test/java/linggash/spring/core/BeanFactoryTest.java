package linggash.spring.core;

import linggash.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
application context adalah turunan dari class BeanFactory
dan semua method yg kita gunakan sebelumnya juga merupakan method
milik BeanFactory atau ListableBeanFactory
*/
public class BeanFactoryTest {

    ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactory() {

        ObjectProvider<Foo> fooObjectProvider = applicationContext.getBeanProvider(Foo.class);
        List<Foo> fooList = fooObjectProvider.stream().toList();

        System.out.println(fooList);

        Map<String, Foo> beansOfType = applicationContext.getBeansOfType(Foo.class);
        System.out.println(beansOfType);
    }
}
