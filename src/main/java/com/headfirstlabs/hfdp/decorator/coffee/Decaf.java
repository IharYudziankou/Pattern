package com.headfirstlabs.hfdp.decorator.coffee;

import com.headfirstlabs.hfdp.decorator.Beverage;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class Decaf extends Beverage {
    private double[] cost = new double[] {1.0, 1.05, 1.1};
    public Decaf(int size) {
        super(size);
        description = "Decaf Coffee";
    }

    public double cost() {
        return cost[getSize()];
    }
}
