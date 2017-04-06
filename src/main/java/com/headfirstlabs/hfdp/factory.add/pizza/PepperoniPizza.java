package com.headfirstlabs.hfdp.factory.add.pizza;

import com.headfirstlabs.hfdp.factory.add.ingredient.PizzaIngredientFactory;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }

}
