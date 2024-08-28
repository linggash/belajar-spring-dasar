package linggash.spring.core;

import linggash.spring.core.service.implementation.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {


}
