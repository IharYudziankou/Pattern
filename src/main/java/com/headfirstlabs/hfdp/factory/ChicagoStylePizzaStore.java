package com.headfirstlabs.hfdp.factory;

import com.headfirstlabs.hfdp.factory.ingredient.ChicagoPizzaIngredientFactory;
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
public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case "cheese" :
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style eep Dish Cheese Pizza");
                break;
            case "pepperoni" :
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            case "clam" :
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "veggie" :
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
        }

        return pizza;
    }
}
