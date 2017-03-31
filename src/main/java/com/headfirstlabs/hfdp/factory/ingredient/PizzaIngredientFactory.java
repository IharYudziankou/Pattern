package com.headfirstlabs.hfdp.factory.ingredient;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
