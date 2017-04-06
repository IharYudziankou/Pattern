package com.headfirstlabs.hfdp.iterator;

import java.util.List;

/**
 * Created by Ihar_Yudziankou on 4/5/2017.
 */
@Deprecated
public class PancakeHouseMenuIterator implements java.util.Iterator<MenuItem> {
    private java.util.Iterator<MenuItem> iterator;

    public PancakeHouseMenuIterator(final List<MenuItem> items) {
        this.iterator = items.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return iterator.next();
    }

    @Override
    public void remove() {
        iterator.remove();
    }
}
