package com.headfirstlabs.hfdp.decorator.condiment;

import com.headfirstlabs.hfdp.decorator.Beverage;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class Mocha extends CondimentDecorator {
    private double[] cost = new double[] {0.10, 0.20, .30};
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public int getSize() {
        return beverage.getSize();
    }

    public double cost() {
        return cost[getSize()] + beverage.cost();
    }
}
