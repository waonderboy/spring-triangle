package com.example.springtriangle.dependency_injection.after;

public class SKInternetService implements InternetService{
    public void connectTo() {
        System.out.println(">>> Connect to Internet Service Provider SK Broadband");
    }
}
