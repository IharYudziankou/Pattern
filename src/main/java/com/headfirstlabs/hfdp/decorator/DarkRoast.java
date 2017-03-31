package com.headfirstlabs.hfdp.decorator;

/**
 * Created by Администратор on 30.03.2017.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Most Excellent Dark Roast";
    }

    public double cost() {
        return super.cost() + 0D;
    }
}
