package com.headfirstlabs.hfdp.proxy;

import com.headfirstlabs.hfdp.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Ihar_Yudziankou on 4/13/2017.
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
