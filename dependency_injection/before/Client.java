package com.example.springtriangle.dependency_injection.before;

public class Client {
    private KTInternetService ktInternetService;

    public void connectToInternet() {
        ktInternetService = new KTInternetService();
        ktInternetService.connectTo();
    }
}
