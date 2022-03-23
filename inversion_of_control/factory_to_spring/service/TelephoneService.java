package com.example.springtriangle.inversion_of_control.factory_to_spring.service;


import com.example.springtriangle.inversion_of_control.factory_to_spring.serviceprovider.TelcoServiceProvider;

public class TelephoneService implements TelcoService {
    private TelcoServiceProvider telcoServiceProvider;

    public TelephoneService (TelcoServiceProvider telcoServiceProvider) {
        this.telcoServiceProvider = telcoServiceProvider;
    }

    public String showConnectMessage() {
        return "Connect to Telephone service of " + telcoServiceProvider.getClass().getSimpleName();
    }

}
