package com.headfirstlabs.hfdp.iterator;

/**
 * Created by Ihar_Yudziankou on 4/5/2017.
 */
public class MenuItem {
    private String name;
    private String description;
    private boolean vegeterian;
    private double price;

    public MenuItem(final String name, final String description, final boolean vegeterian, final double price) {
        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public double getPrice() {
        return price;
    }

}
