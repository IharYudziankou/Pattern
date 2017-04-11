package com.headfirstlabs.hfdp.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Ihar_Yudziankou on 4/11/2017.
 */
public class MyRemoteClient {
    public static void main(final String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            final MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
            final String s = service.sayHello();
            System.out.println(s);
        } catch (final NotBoundException e) {
            e.printStackTrace();
        } catch (final MalformedURLException e) {
            e.printStackTrace();
        } catch (final RemoteException e) {
            e.printStackTrace();
        }
    }
}
