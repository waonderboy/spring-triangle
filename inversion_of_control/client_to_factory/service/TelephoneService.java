package com.example.springtriangle.inversion_of_control.client_to_factory.service;


import com.example.springtriangle.inversion_of_control.client_to_factory.serviceprovider.TelcoServiceProvider;

public class TelephoneService implements TelcoService {
    private TelcoServiceProvider telcoServiceProvider;

    public TelephoneService (TelcoServiceProvider telcoServiceProvider) {
        this.telcoServiceProvider = telcoServiceProvider;
    }

    public String showConnectMessage() {
        return "Connect to Telephone service of " + telcoServiceProvider.getClass().getSimpleName();
    }

}
