package com.headfirstlabs.hfdp.strategy.duck;

import com.headfirstlabs.hfdp.strategy.behavior.impl.FlyNoWay;
import com.headfirstlabs.hfdp.strategy.behavior.impl.Squeak;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();

    }

    @Override
    public void display() {
        System.out.println("I am Rubber Duck");
    }

}
