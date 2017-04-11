package com.headfirstlabs.hfdp.state;

/**
 * Created by Ihar_Yudziankou on 4/11/2017.
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
