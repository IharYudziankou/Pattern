package com.headfirstlabs.hfdp.factory.add.pizza;

import com.headfirstlabs.hfdp.factory.add.ingredient.PizzaIngredientFactory;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {

    }

}
