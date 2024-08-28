package linggash.spring.core.factory;

import linggash.spring.core.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/*
jika kita menggunakan class yang kita import dari luar
yang tidak bisa kita ubah codenya untuk menambahkan
annotation @Component, maka kita bisa menggunakan
class factory bean untuk menjadikannya component

*/

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndpoint("https://contoh.com");
        client.setPrivateKey("privasi");
        client.setPublicKey("umum");
        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
