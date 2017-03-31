package com.headfirstlabs.hfdp.factory;

import com.headfirstlabs.hfdp.factory.pizza.Pizza;
import com.headfirstlabs.hfdp.factory.pizza.ny.CheesePizza;
import com.headfirstlabs.hfdp.factory.pizza.ny.ClamPizza;
import com.headfirstlabs.hfdp.factory.pizza.ny.PepperoniPizza;
import com.headfirstlabs.hfdp.factory.pizza.ny.VeggiePizza;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class NYStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese" : pizza = new CheesePizza(); break;
            case "pepperoni" : pizza = new PepperoniPizza(); break;
            case "clam" : pizza = new ClamPizza(); break;
            case "veggie" : pizza = new VeggiePizza(); break;
        }

        return pizza;
    }
}
