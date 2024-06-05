package linggash.spring.core;

import linggash.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDuplicateTest {

    @Test
    void testDuplicate() {

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });

    }

    // test untuk mengecek apakah dua foo yang dibuat diconfig berbeda
    @Test
    void getBean() {

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

//        jika kita ingin mengambil bean dengan class yang sama maka kita perlu menyebutkan namanya juga

        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);

    }
}
