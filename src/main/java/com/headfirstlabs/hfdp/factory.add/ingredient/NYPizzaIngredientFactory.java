package com.headfirstlabs.hfdp.factory.add.ingredient;

import com.headfirstlabs.hfdp.factory.add.ingredient.cheese.Cheese;
import com.headfirstlabs.hfdp.factory.add.ingredient.cheese.ReggianoCheese;
import com.headfirstlabs.hfdp.factory.add.ingredient.clam.Clams;
import com.headfirstlabs.hfdp.factory.add.ingredient.clam.FreshClam;
import com.headfirstlabs.hfdp.factory.add.ingredient.dough.Dough;
import com.headfirstlabs.hfdp.factory.add.ingredient.dough.ThinCrustDough;
import com.headfirstlabs.hfdp.factory.add.ingredient.pepperoni.Pepperoni;
import com.headfirstlabs.hfdp.factory.add.ingredient.pepperoni.SlicedPepperoni;
import com.headfirstlabs.hfdp.factory.add.ingredient.sauce.MarinaraSauce;
import com.headfirstlabs.hfdp.factory.add.ingredient.sauce.Sauce;
import com.headfirstlabs.hfdp.factory.add.ingredient.veggies.*;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClam();
    }
}
