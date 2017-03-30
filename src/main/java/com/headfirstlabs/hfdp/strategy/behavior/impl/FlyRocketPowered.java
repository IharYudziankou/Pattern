package com.headfirstlabs.hfdp.strategy.behavior.impl;

import com.headfirstlabs.hfdp.strategy.behavior.FlyBehavior;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
