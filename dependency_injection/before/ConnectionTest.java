package com.example.springtriangle.dependency_injection.before;

public class ConnectionTest {
    public static void main(String args[]) {
        Client client = new Client();
        client.connectToInternet();
    }
}
