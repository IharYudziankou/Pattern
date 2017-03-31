package com.headfirstlabs.hfdp.decorator.coffee;

import com.headfirstlabs.hfdp.decorator.Beverage;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class HouseBlend extends Beverage {
    private double[] cost = new double[] {0.77, 0.89, 1.0};
    public HouseBlend(int size) {
        super(size);
        description = "House Blend Coffee";
    }

    public double cost() {
        return cost[getSize()];
    }
}
