package com.headfirstlabs.hfdp.composite;

import java.util.Iterator;

/**
 * Created by Администратор on 11.04.2017.
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
