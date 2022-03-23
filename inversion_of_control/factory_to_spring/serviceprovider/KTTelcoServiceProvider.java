package com.example.springtriangle.inversion_of_control.factory_to_spring.serviceprovider;

public class KTTelcoServiceProvider implements TelcoServiceProvider {
    public void connectTo() {
        System.out.println(">>> Telecommunication Service Provider, KT");
    }
    public void disconnect() {System.out.println(">>> Disconnect to us."); }
}
