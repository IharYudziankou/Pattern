package com.headfirstlabs.hfdp.proxy;

import java.rmi.RemoteException;

/**
 * Created by Ihar_Yudziankou on 4/11/2017.
 */
public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(final GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
            System.out.println("Current state: " + gumballMachine.getState());
        } catch (final RemoteException e) {
            e.printStackTrace();
        }
    }
}
