package com.headfirstlabs.hfdp.factory.add;

import com.headfirstlabs.hfdp.factory.add.ingredient.NYPizzaIngredientFactory;
import com.headfirstlabs.hfdp.factory.add.ingredient.PizzaIngredientFactory;
import com.headfirstlabs.hfdp.factory.add.pizza.*;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    PizzaIngredientFactory getIngredientFactory() {
        return new NYPizzaIngredientFactory();
    }
}
