package com.headfirstlabs.hfdp.strategy.duck;

import com.headfirstlabs.hfdp.strategy.behavior.impl.FlyNoWay;
import com.headfirstlabs.hfdp.strategy.behavior.impl.MuteQuack;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am Decoy Duck");
    }

}
