package linggash.spring.core.processor;

import linggash.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

/*
BeanPostProcessor digunakan saat kita ingin memodifikasi bean
saat selesai diproses dan kita bisa memodifikasinya sebelum dan
sesudah initialization

Ordered digunakan saat kita ingin mengurutkan BeanPostProcessor.
Semakin kecil angkanya maka akan dieksekusi terlebih dahulu.
*/

@Slf4j
@Component
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Id Generator Processor for Bean {}", bean);
        if (bean instanceof IdAware) {
            log.info("Set Prefix Id Generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("Prefix- " + idAware.getId());
        }

        return bean;
    }
}
