package com.headfirstlabs.hfdp.adapter.collection;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class IteratorEnumeration implements Enumeration {
    private Iterator iterator;

    public IteratorEnumeration(final Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
