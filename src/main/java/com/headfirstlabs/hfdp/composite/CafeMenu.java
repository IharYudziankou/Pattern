package com.headfirstlabs.hfdp.composite;

import com.headfirstlabs.hfdp.iterator.Menu;
import com.headfirstlabs.hfdp.iterator.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by Администратор on 06.04.2017.
 */
public class CafeMenu implements Menu{
    private Hashtable<String, MenuItem> menuItems = new Hashtable<>();

    public CafeMenu() {
        addMenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addMenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addMenuItem("Burrito", "A large burrito, with wholke pinto beans, salsa, guacamole", true, 4.29);
    }

    private void addMenuItem(final String name, final String description, final boolean vegetarian, final double price) {
        MenuItem menuItem = new MenuItem(name, description,vegetarian,price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
