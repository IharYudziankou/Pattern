package com.headfirstlabs.hfdp.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Ihar_Yudziankou on 4/13/2017.
 */
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}
