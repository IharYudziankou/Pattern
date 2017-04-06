package com.headfirstlabs.hfdp.factory.add.ingredient;

/**
 * Created by Администратор on 04.04.2017.
 */
public interface Indredient {
    String name = "Unknown";
    default String getName() {
        return name;
    }
}
