package com.headfirstlabs.hfdp.factory;

import com.headfirstlabs.hfdp.factory.ingredient.NYPizzaIngredientFactory;
import com.headfirstlabs.hfdp.factory.ingredient.PizzaIngredientFactory;
import com.headfirstlabs.hfdp.factory.pizza.Pizza;
import com.headfirstlabs.hfdp.factory.pizza.CheesePizza;
import com.headfirstlabs.hfdp.factory.pizza.ClamPizza;
import com.headfirstlabs.hfdp.factory.pizza.PepperoniPizza;
import com.headfirstlabs.hfdp.factory.pizza.VeggiePizza;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class NYStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese" :
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            case "pepperoni" :
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            case "clam" :
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            case "veggie" :
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
        }

        return pizza;
    }
}
