package com.example.springtriangle.inversion_of_control.client_to_factory;

import com.example.springtriangle.inversion_of_control.client_to_factory.service.InternetService;
import com.example.springtriangle.inversion_of_control.client_to_factory.service.TelephoneService;
import com.example.springtriangle.inversion_of_control.client_to_factory.service.TvService;
import com.example.springtriangle.inversion_of_control.client_to_factory.serviceprovider.KTTelcoServiceProvider;
import com.example.springtriangle.inversion_of_control.client_to_factory.serviceprovider.TelcoServiceProvider;

public class TelcoServiceFactory {

    public InternetService telcoInternetService() {
        return new InternetService(serviceAgreement());
    }

    public TvService telcoTvService() {
        return new TvService(serviceAgreement());
    }

    public TelephoneService telcoTelephoneService() {
        return new TelephoneService(serviceAgreement());
    }

    public TelcoServiceProvider serviceAgreement() {
        TelcoServiceProvider ktServiceProvider = new KTTelcoServiceProvider();
        ktServiceProvider.connectTo();
        return ktServiceProvider;
    }

    private static class telcoServiceHolder {
        private static final TelcoServiceFactory INSTANCE = new TelcoServiceFactory();
    }

    public static TelcoServiceFactory getInstance() {
        return telcoServiceHolder.INSTANCE;
    }
}
