package com.headfirstlabs.hfdp.composite;

import com.headfirstlabs.hfdp.iterator.MenuItem;

import java.util.Iterator;
import java.util.Calendar;

public class AlternatingDinnerMenuIterator implements Iterator {

    MenuItem[] items;
    int position;

    public AlternatingDinnerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position = position +2;
        return menuItem;
    }

    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Alternating Dinner Menu Iterator does not support remove()");
    }

}
