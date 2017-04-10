package com.headfirstlabs.hfdp.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Администратор on 10.04.2017.
 */
public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;
    private Iterator iterator;

    public Menu(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(final MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(final MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(final int i) {
        return menuComponents.get(i);
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
    public void print() {
        System.out.println();
        System.out.print(getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        final Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            final MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}
