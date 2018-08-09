package com.headfirstlabs.hfdp.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Ihar_Yudziankou on 4/13/2017.
 */
public class Server implements Hello {

    @Override
    public String sayHello() throws RemoteException {
        return "Hello, world!";
    }

    public static void main(final String[] args) {
        try {
            final Server obj = new Server();
            final Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            final Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello", stub);

            System.err.println("Server ready");
        } catch (final Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
