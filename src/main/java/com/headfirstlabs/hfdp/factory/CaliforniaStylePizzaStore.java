package com.headfirstlabs.hfdp.factory;

import com.headfirstlabs.hfdp.factory.pizza.Pizza;
import com.headfirstlabs.hfdp.factory.pizza.california.CheesePizza;
import com.headfirstlabs.hfdp.factory.pizza.california.ClamPizza;
import com.headfirstlabs.hfdp.factory.pizza.california.PepperoniPizza;
import com.headfirstlabs.hfdp.factory.pizza.california.VeggiePizza;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class CaliforniaStylePizzaStore extends PizzaStore{

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
