package com.example.springtriangle.inversion_of_control.factory_to_spring;

import com.example.springtriangle.inversion_of_control.factory_to_spring.service.InternetService;
import com.example.springtriangle.inversion_of_control.factory_to_spring.service.TelephoneService;
import com.example.springtriangle.inversion_of_control.factory_to_spring.service.TvService;
import org.springframework.context.ApplicationContext;

public class Client {
    private TvService tvService;
    private InternetService internetService;
    private TelephoneService telephoneService;

    public Client(TvService tvService, InternetService internetService, TelephoneService telephoneService) {
        this.tvService = tvService;
        this.internetService = internetService;
        this.telephoneService = telephoneService;
    }

    public void connectToTvService() {
        System.out.println(tvService.showConnectMessage());
    }

    public void connectToInternetService() {
        System.out.println(internetService.showConnectMessage());
    }

    public void connectToTelephoneService() {
        System.out.println(telephoneService.showConnectMessage());
    }
}
