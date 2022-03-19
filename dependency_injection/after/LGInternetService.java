package com.example.springtriangle.dependency_injection.after;

public class LGInternetService implements InternetService{
    public void connectTo() {
        System.out.println(">>> Connect to Internet Service Provider LG U+");
    }
}
