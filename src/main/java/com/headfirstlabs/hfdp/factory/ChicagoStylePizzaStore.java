package com.headfirstlabs.hfdp.factory;

import com.headfirstlabs.hfdp.factory.pizza.Pizza;
import com.headfirstlabs.hfdp.factory.pizza.chicago.CheesePizza;
import com.headfirstlabs.hfdp.factory.pizza.chicago.ClamPizza;
import com.headfirstlabs.hfdp.factory.pizza.chicago.PepperoniPizza;
import com.headfirstlabs.hfdp.factory.pizza.chicago.VeggiePizza;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class ChicagoStylePizzaStore extends PizzaStore{

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
