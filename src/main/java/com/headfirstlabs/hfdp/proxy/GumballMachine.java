package com.headfirstlabs.hfdp.proxy;

/**
 * Created by Ihar_Yudziankou on 4/11/2017.
 */
public class GumballMachine extends com.headfirstlabs.hfdp.state.GumballMachine implements GumballMachineRemote {
    private String location;

    public GumballMachine(final String location, final int numberGumballs) {
        super(numberGumballs);
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }
}
