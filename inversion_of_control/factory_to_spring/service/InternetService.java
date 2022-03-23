package com.example.springtriangle.inversion_of_control.factory_to_spring.service;

import com.example.springtriangle.inversion_of_control.factory_to_spring.serviceprovider.TelcoServiceProvider;

public class InternetService implements TelcoService {
    private TelcoServiceProvider telcoServiceProvider;

    public InternetService (TelcoServiceProvider telcoServiceProvider) {
        this.telcoServiceProvider = telcoServiceProvider;
    }

    public String showConnectMessage() {
        return "Connect to Internet service of " + telcoServiceProvider.getClass().getSimpleName();
    }

}
