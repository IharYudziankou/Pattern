package com.headfirstlabs.hfdp.state;

import java.io.Serializable;

/**
 * Created by Ihar_Yudziankou on 4/11/2017.
 */
public interface State extends Serializable {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
