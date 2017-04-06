package com.headfirstlabs.hfdp.factory.add;

import com.headfirstlabs.hfdp.factory.add.pizza.Pizza;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza);
        System.out.println();

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza);
        System.out.println();
    }

}
