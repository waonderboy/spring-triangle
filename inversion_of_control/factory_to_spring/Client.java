package com.example.springtriangle.inversion_of_control.factory_to_spring;

import com.example.springtriangle.inversion_of_control.factory_to_spring.service.InternetService;
import com.example.springtriangle.inversion_of_control.factory_to_spring.service.TelephoneService;
import com.example.springtriangle.inversion_of_control.factory_to_spring.service.TvService;
import org.springframework.context.ApplicationContext;

public class Client {
    private TvService tvService;
    private InternetService internetService;
    private TelephoneService telephoneService;
    ApplicationContext context = ApplicationContextProvider.getContext();

    public Client() {
        this.tvService = context.getBean(TvService.class);
        this.internetService = context.getBean(InternetService.class);
        this.telephoneService = context.getBean(TelephoneService.class);
    }

    public void connectToTvService() {
        System.out.println(this.tvService.showConnectMessage());
    }

    public void connectToInternetService() {
        System.out.println(this.internetService.showConnectMessage());
    }

    public void connectToTelephoneService() {
        System.out.println(this.telephoneService.showConnectMessage());
    }
}


