package com.headfirstlabs.hfdp.proxy;

/**
 * Created by Ihar_Yudziankou on 4/11/2017.
 */
public class GumballMachineTestDrive {
    public static void main(final String[] args) {
        int count = 0;

        if (args.length < 2) {
            System.out.println("Gumball Machine <name> <inventory>");
            System.exit(1);
        }
        count = Integer.parseInt(args[1]);
        final GumballMachine gumballMachine = new GumballMachine(args[0], count);
        final GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();
    }
}
