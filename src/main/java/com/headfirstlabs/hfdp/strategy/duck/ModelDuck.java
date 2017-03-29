package com.headfirstlabs.hfdp.strategy.duck;

import com.headfirstlabs.hfdp.strategy.behavior.impl.FlyNoWay;
import com.headfirstlabs.hfdp.strategy.behavior.impl.Quack;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
