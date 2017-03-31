package com.headfirstlabs.hfdp.factory.pizza.chicago;

import com.headfirstlabs.hfdp.factory.pizza.Pizza;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class CheesePizza extends Pizza{

    public CheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");

    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
