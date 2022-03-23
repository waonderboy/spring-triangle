package com.example.springtriangle.inversion_of_control.client_to_factory;

import com.example.springtriangle.inversion_of_control.client_to_factory.service.InternetService;
import com.example.springtriangle.inversion_of_control.client_to_factory.service.TelephoneService;
import com.example.springtriangle.inversion_of_control.client_to_factory.service.TvService;

public class Client {
    private TvService tvService = TelcoServiceFactory.getInstance().telcoTvService();
    private InternetService internetService = TelcoServiceFactory.getInstance().telcoInternetService();
    private TelephoneService telephoneService = TelcoServiceFactory.getInstance().telcoTelephoneService();

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


