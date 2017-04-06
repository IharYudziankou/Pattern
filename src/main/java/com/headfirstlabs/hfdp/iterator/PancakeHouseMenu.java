package com.headfirstlabs.hfdp.iterator;

import java.util.ArrayList;

/**
 * Created by Ihar_Yudziankou on 4/5/2017.
 */
public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choise of blueberries or strawberries", true, 3.59);
    }

    private void addItem(final String name, final String description, final boolean vegetarian, final double price) {
        final MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public java.util.Iterator createIterator() {
        return menuItems.iterator();
    }

}
