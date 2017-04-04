package com.headfirstlabs.hfdp.adapter;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
