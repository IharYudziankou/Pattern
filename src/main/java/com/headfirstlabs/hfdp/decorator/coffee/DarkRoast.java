package com.headfirstlabs.hfdp.decorator.coffee;

import com.headfirstlabs.hfdp.decorator.Beverage;

/**
 * Created by Администратор on 30.03.2017.
 */
public class DarkRoast extends Beverage {
    private double[] cost = new double[] {0.88, 0.99, 1.09};
    public DarkRoast(int size) {
        super(size);
        description = "Most Excellent Dark Roast";
    }

    public double cost() {
        return cost[getSize()];
    }
}
