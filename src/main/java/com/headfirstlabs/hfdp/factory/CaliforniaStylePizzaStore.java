package com.headfirstlabs.hfdp.factory;

import com.headfirstlabs.hfdp.factory.pizza.Pizza;
import com.headfirstlabs.hfdp.factory.pizza.CheesePizza;
import com.headfirstlabs.hfdp.factory.pizza.ClamPizza;
import com.headfirstlabs.hfdp.factory.pizza.PepperoniPizza;
import com.headfirstlabs.hfdp.factory.pizza.VeggiePizza;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class CaliforniaStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese" : pizza = new CheesePizza(null); break;
            case "pepperoni" : pizza = new PepperoniPizza(null); break;
            case "clam" : pizza = new ClamPizza(null); break;
            case "veggie" : pizza = new VeggiePizza(null); break;
        }

        return pizza;
    }
}
