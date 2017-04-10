package com.headfirstlabs.hfdp.composite;

import com.headfirstlabs.hfdp.iterator.Menu;
import com.headfirstlabs.hfdp.iterator.MenuItem;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Администратор on 06.04.2017.
 */
public class Waitress extends com.headfirstlabs.hfdp.iterator.Waitress {
    private List<Menu> menus;


    public Waitress(final List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public void printMenu() {
        final Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            final Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    @Override
    protected void printMenu(final Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            final MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
