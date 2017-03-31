package com.headfirstlabs.hfdp.decorator;

/**
 * Created by Администратор on 30.03.2017.
 */
public abstract class Beverage {

    public static final int SIZE_S = 0;
    public static final int SIZE_M = 1;
    public static final int SIZE_L = 2;

    protected String description = "Unknown Beverage";
    private int size = SIZE_M;

    public Beverage(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public int getSize() {
        return size;
    }
}
