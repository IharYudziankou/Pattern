package com.headfirstlabs.hfdp.decorator.condiment;

import com.headfirstlabs.hfdp.decorator.Beverage;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public abstract class CondimentDecorator extends Beverage {
    public CondimentDecorator() {
        super(Beverage.SIZE_M);
    }
    public abstract String getDescription();
    public abstract int getSize();
}
