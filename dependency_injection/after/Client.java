package com.example.springtriangle.dependency_injection.after;

public class Client {
    private InternetService internetService;

    public Client(InternetService internetService) {
        this.internetService = internetService;
    }

    public void connectToInternet() {
        internetService.connectTo();
    }
}
