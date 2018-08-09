package com.headfirstlabs.hfdp.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Ihar_Yudziankou on 4/13/2017.
 */
public class GumballMonitorTestDrive {
    public static void main(final String[] args) {
        final String[] location = {
                "rmi://epbymogw0046/gumballmachine"
        };

        final GumballMonitor[] monitor = new GumballMonitor[location.length];

        int i = 0;
        for (final String loc : location) {
            try {
                final GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(loc);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
                i++;
            } catch (final NotBoundException e) {
                e.printStackTrace();
            } catch (final MalformedURLException e) {
                e.printStackTrace();
            } catch (final RemoteException e) {
                e.printStackTrace();
            }
        }

        for (final GumballMonitor monitor1 : monitor) {
            monitor1.report();
        }
    }
}
