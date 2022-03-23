package com.example.springtriangle.inversion_of_control.factory_to_spring.serviceprovider;

public class LGTelcoServiceProvider implements TelcoServiceProvider {
    public void connectTo() {
        System.out.println(">>> Telecommunication Service Provider, LG U+");
    }
    public void disconnect() {System.out.println(">>> Disconnect to us."); }
}
