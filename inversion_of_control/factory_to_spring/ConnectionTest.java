package com.example.springtriangle.inversion_of_control.factory_to_spring;

import com.example.springtriangle.inversion_of_control.factory_to_spring.service.InternetService;
import com.example.springtriangle.inversion_of_control.factory_to_spring.service.TelephoneService;
import com.example.springtriangle.inversion_of_control.factory_to_spring.service.TvService;
import com.example.springtriangle.inversion_of_control.factory_to_spring.serviceprovider.KTTelcoServiceProvider;
import com.example.springtriangle.inversion_of_control.factory_to_spring.serviceprovider.TelcoServiceProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ConnectionTest {
    public static void main(String args[]) {
        SpringApplication.run(ConnectionTest.class, args);
        Client client = new Client();

        System.out.println("------------------------------------------------------");
        client.connectToTvService();
        client.connectToInternetService();
        client.connectToTelephoneService();
        System.out.println("------------------------------------------------------");

    }
}

@Configuration
class TelcoServiceFactory {

    @Bean
    public InternetService telcoInternetService() {
        return new InternetService(serviceAgreement());
    }

    @Bean
    public TvService telcoTvService() {
        return new TvService(serviceAgreement());
    }

    @Bean
    public TelephoneService telcoTelephoneService() {
        return new TelephoneService(serviceAgreement());
    }

    @Bean
    public TelcoServiceProvider serviceAgreement() {
        TelcoServiceProvider ktServiceProvider = new KTTelcoServiceProvider();
        ktServiceProvider.connectTo();
        return ktServiceProvider;
    }
}
