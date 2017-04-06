package com.headfirstlabs.hfdp.factory.add.pizza;

import com.headfirstlabs.hfdp.factory.add.ingredient.PizzaIngredientFactory;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
