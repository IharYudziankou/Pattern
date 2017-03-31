package com.headfirstlabs.hfdp.factory.pizza.ny;

import com.headfirstlabs.hfdp.factory.pizza.Pizza;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class CheesePizza extends Pizza{

    public CheesePizza() {
        name = "NY Style Sause and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sause";

        toppings.add("Grated Reggiano Cheese");  
    }

}
