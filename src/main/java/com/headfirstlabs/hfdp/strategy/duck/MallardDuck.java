package com.headfirstlabs.hfdp.strategy.duck;

import com.headfirstlabs.hfdp.strategy.behavior.impl.FlyWithWings;
import com.headfirstlabs.hfdp.strategy.behavior.impl.Quack;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
