package com.headfirstlabs.hfdp.adapter;

import java.util.Random;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class DuckAdapter implements Turkey {
    private Duck duck;
    Random random;

    public DuckAdapter(final Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt() == 5) {
            duck.fly();
        }
    }
}
