package linggash.spring.core.processor;

import linggash.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.UUID;

/*
BeanPostProcessor digunakan saat kita ingin memodifikasi bean
saat selesai diproses dan kita bisa memodifikasinya sebelum dan
sesudah initialization
*/

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id Generator Processor for Bean {}", bean);
        if (bean instanceof IdAware) {
            log.info("Set Id Generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }

        return bean;
    }
}
