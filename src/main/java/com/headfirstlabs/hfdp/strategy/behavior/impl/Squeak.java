package com.headfirstlabs.hfdp.strategy.behavior.impl;

import com.headfirstlabs.hfdp.strategy.behavior.QuackBehavior;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
