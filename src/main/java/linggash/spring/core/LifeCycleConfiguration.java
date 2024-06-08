package linggash.spring.core;

import linggash.spring.core.data.Connection;
import linggash.spring.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    // saat sudah menggunakan annotation @PostConstruct atau @PreDestroy
    // maka tidak perlu lagi untuk menggunakan initMethod dan destroyMethod

//    @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server() {
        return new Server();
    }

}
