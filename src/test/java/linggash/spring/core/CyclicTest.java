package linggash.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {

    @Test
    void testCyclic() {

        Assertions.assertThrows(Throwable.class, () -> new AnnotationConfigApplicationContext(CyclicConfiguration.class));

    }
}
