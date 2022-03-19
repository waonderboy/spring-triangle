package com.example.springtriangle.dependency_injection.after;

public class ConnectionTest {
    public static void main(String args[]) {
        Client client1 = new Client(new KTInternetService());
        client1.connectToInternet();

        Client client2 = new Client(new LGInternetService());
        client2.connectToInternet();

        Client client3 = new Client(new SKInternetService());
        client3.connectToInternet();
    }
}
