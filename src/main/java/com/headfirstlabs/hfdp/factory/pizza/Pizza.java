package com.headfirstlabs.hfdp.factory.pizza;

import com.headfirstlabs.hfdp.factory.ingredient.Cheese;
import com.headfirstlabs.hfdp.factory.ingredient.Clams;
import com.headfirstlabs.hfdp.factory.ingredient.Pepperoni;
import com.headfirstlabs.hfdp.factory.ingredient.Veggies;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clams != null) {
            result.append(clams);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
