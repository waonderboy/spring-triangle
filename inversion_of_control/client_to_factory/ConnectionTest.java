package com.example.springtriangle.inversion_of_control.client_to_factory;

import com.example.springtriangle.inversion_of_control.client_to_factory.Client;

public class ConnectionTest {
    public static void main(String args[]) {
        Client client = new Client();

        System.out.println("------------------------------------------------------");
        client.connectToTvService();
        client.connectToInternetService();
        client.connectToTelephoneService();
        System.out.println("------------------------------------------------------");
    }
}
