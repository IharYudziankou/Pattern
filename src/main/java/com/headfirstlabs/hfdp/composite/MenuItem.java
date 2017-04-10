package com.headfirstlabs.hfdp.composite;

import java.util.Iterator;

/**
 * Created by Администратор on 10.04.2017.
 */
public class MenuItem extends MenuComponent {

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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegeterian() {
        return vegeterian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegeterian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     --" + getDescription());
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
