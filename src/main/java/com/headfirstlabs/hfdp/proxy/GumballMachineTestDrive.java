package com.headfirstlabs.hfdp.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by Ihar_Yudziankou on 4/11/2017.
 */
public class GumballMachineTestDrive {
    public static void main(final String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count = 0;
        if (args.length < 2) {
            System.out.println("Gumball Machine <name> <inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (final RemoteException e) {
            e.printStackTrace();
        } catch (final MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
