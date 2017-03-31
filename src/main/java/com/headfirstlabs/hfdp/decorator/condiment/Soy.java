package com.headfirstlabs.hfdp.decorator.condiment;

import com.headfirstlabs.hfdp.decorator.Beverage;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class Soy extends CondimentDecorator {
    private double[] cost = new double[] {0.10, 0.15, .20};
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public int getSize() {
        return beverage.getSize();
    }

    public double cost() {
        return cost[getSize()] + beverage.cost();
    }
}
