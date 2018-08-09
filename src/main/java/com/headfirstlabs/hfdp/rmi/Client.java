package com.headfirstlabs.hfdp.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Ihar_Yudziankou on 4/13/2017.
 */
public class Client {
    private Client() {
    }

    public static void main(final String[] args) {

        final String host = (args.length < 1) ? null : args[0];
        try {
            final Registry registry = LocateRegistry.getRegistry(host);
            final Hello stub = (Hello) registry.lookup("Hello");
            final String response = stub.sayHello();
            System.out.println("response: " + response);
        } catch (final Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
