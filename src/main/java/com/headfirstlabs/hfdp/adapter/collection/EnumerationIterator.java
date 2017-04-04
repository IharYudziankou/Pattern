package com.headfirstlabs.hfdp.adapter.collection;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class EnumerationIterator implements Iterator {

    private Enumeration enumeration;

    public EnumerationIterator(final Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
