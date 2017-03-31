package com.headfirstlabs.hfdp.decorator.coffee;

import com.headfirstlabs.hfdp.decorator.Beverage;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class Espresso extends Beverage {
    private double[] cost = new double[] {1.0, 1.99, 2.5};
    public Espresso(int size) {
        super(size);
        description = "Espresso";
    }

    public double cost() {
        return cost[getSize()];
    }
}
