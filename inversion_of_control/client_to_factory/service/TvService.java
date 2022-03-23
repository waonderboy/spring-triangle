package com.example.springtriangle.inversion_of_control.client_to_factory.service;

import com.example.springtriangle.inversion_of_control.client_to_factory.serviceprovider.TelcoServiceProvider;

public class TvService implements TelcoService {
    private TelcoServiceProvider telcoServiceProvider;

    public TvService (TelcoServiceProvider telcoServiceProvider) {
        this.telcoServiceProvider = telcoServiceProvider;
    }

    public String showConnectMessage() {
        return "Connect to Tv service of " + telcoServiceProvider.getClass().getSimpleName();
    }
}
