package com.example.springtriangle.inversion_of_control.client_to_factory.service;
import com.example.springtriangle.inversion_of_control.client_to_factory.serviceprovider.TelcoServiceProvider;

public class InternetService implements TelcoService {
    private TelcoServiceProvider telcoServiceProvider;

    public InternetService (TelcoServiceProvider telcoServiceProvider) {
        this.telcoServiceProvider = telcoServiceProvider;
    }

    public String showConnectMessage() {
        return "Connect to Internet service of " + telcoServiceProvider.getClass().getSimpleName();
    }

}
