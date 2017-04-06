package com.headfirstlabs.hfdp.factory.add;

import com.headfirstlabs.hfdp.factory.add.ingredient.ChicagoPizzaIngredientFactory;
import com.headfirstlabs.hfdp.factory.add.ingredient.PizzaIngredientFactory;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    PizzaIngredientFactory getIngredientFactory() {
        return new ChicagoPizzaIngredientFactory();
    }
}
