package com.headfirstlabs.hfdp.composite;

import java.util.Iterator;

/**
 * Created by Администратор on 10.04.2017.
 */
public abstract class MenuComponent {
    public void add(final MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(final MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(final int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegeterian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<MenuComponent> createIterator();

}
