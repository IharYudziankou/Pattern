package com.headfirstlabs.hfdp.adapter;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
