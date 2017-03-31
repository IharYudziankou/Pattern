package com.headfirstlabs.hfdp.factory;

import com.headfirstlabs.hfdp.factory.pizza.Pizza;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
