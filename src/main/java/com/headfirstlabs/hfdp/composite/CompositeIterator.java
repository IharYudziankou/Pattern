package com.headfirstlabs.hfdp.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Администратор on 10.04.2017.
 */
public class CompositeIterator implements Iterator {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(final Iterator iterator) {
        this.stack.push(iterator);
    }

    @Override
    public Object next() {
        if (hasNext()) {
            final Iterator<MenuComponent> iterator = stack.peek();
            final MenuComponent component = iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            final Iterator<MenuComponent> iterator = stack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                stack.pop();
                return hasNext();
            }
        }
    }
}
