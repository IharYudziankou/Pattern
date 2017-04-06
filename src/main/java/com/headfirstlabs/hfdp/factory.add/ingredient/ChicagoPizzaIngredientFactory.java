package com.headfirstlabs.hfdp.factory.add.ingredient;

import com.headfirstlabs.hfdp.factory.add.ingredient.cheese.Cheese;
import com.headfirstlabs.hfdp.factory.add.ingredient.cheese.MozzarellaCheese;
import com.headfirstlabs.hfdp.factory.add.ingredient.clam.Clams;
import com.headfirstlabs.hfdp.factory.add.ingredient.clam.FrozenClam;
import com.headfirstlabs.hfdp.factory.add.ingredient.dough.Dough;
import com.headfirstlabs.hfdp.factory.add.ingredient.dough.ThickCrustDough;
import com.headfirstlabs.hfdp.factory.add.ingredient.pepperoni.Pepperoni;
import com.headfirstlabs.hfdp.factory.add.ingredient.pepperoni.SlicedPepperoni;
import com.headfirstlabs.hfdp.factory.add.ingredient.sauce.PlumTomatoSauce;
import com.headfirstlabs.hfdp.factory.add.ingredient.sauce.Sauce;
import com.headfirstlabs.hfdp.factory.add.ingredient.veggies.BlackOlives;
import com.headfirstlabs.hfdp.factory.add.ingredient.veggies.Eggplant;
import com.headfirstlabs.hfdp.factory.add.ingredient.veggies.Spinach;
import com.headfirstlabs.hfdp.factory.add.ingredient.veggies.Veggies;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClam();
    }
}
