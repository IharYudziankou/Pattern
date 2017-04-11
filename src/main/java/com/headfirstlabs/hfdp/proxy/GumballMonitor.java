package com.headfirstlabs.hfdp.proxy;

/**
 * Created by Ihar_Yudziankou on 4/11/2017.
 */
public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(final GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
        System.out.println("Current state: " + gumballMachine.getState());
    }
}
