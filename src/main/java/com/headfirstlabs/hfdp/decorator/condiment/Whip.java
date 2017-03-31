package com.headfirstlabs.hfdp.decorator.condiment;

import com.headfirstlabs.hfdp.decorator.Beverage;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class Whip extends CondimentDecorator {
    private double[] cost = new double[] {0.05, 0.10, .15};
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public int getSize() {
        return beverage.getSize();
    }

    public double cost() {
        return cost[getSize()] + beverage.cost();
    }
}
