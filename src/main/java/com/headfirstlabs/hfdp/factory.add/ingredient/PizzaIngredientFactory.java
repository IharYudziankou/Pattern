package com.headfirstlabs.hfdp.factory.add.ingredient;

import com.headfirstlabs.hfdp.factory.add.ingredient.cheese.Cheese;
import com.headfirstlabs.hfdp.factory.add.ingredient.clam.Clams;
import com.headfirstlabs.hfdp.factory.add.ingredient.dough.Dough;
import com.headfirstlabs.hfdp.factory.add.ingredient.pepperoni.Pepperoni;
import com.headfirstlabs.hfdp.factory.add.ingredient.sauce.Sauce;
import com.headfirstlabs.hfdp.factory.add.ingredient.veggies.Veggies;

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
