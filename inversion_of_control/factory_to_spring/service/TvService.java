package com.example.springtriangle.inversion_of_control.factory_to_spring.service;

import com.example.springtriangle.inversion_of_control.factory_to_spring.serviceprovider.TelcoServiceProvider;

public class TvService implements TelcoService {
    private TelcoServiceProvider telcoServiceProvider;

    public TvService (TelcoServiceProvider telcoServiceProvider) {
        this.telcoServiceProvider = telcoServiceProvider;
    }

    public String showConnectMessage() {
        return "Connect to Tv service of " + telcoServiceProvider.getClass().getSimpleName();
    }
}
