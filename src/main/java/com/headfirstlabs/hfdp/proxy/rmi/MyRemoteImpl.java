package com.headfirstlabs.hfdp.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Ihar_Yudziankou on 4/11/2017.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public static void main(final String[] args) {
        final MyRemote service;
        try {
            service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (final RemoteException e) {
            e.printStackTrace();
        } catch (final MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
