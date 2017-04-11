package com.headfirstlabs.hfdp.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Ihar_Yudziankou on 4/11/2017.
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
