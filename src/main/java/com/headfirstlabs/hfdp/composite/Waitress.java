package com.headfirstlabs.hfdp.composite;

import java.util.Iterator;

/**
 * Created by Администратор on 06.04.2017.
 */
public class Waitress {
    private MenuComponent allMenus;


    public Waitress(final MenuComponent allMenus) {
        this.allMenus = allMenus;
    }


    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        final Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println();
        System.out.println("VEGETARIAN MENU");
        System.out.println("----");
        while (iterator.hasNext()) {
            final MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegeterian()) {
                    menuComponent.print();
                }
            } catch (final UnsupportedOperationException e) {

            }
        }
    }
}
