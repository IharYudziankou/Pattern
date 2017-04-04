package com.headfirstlabs.hfdp.template;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public abstract class CaffeineBeverageWithHook {
    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments() {
        return true;
    }

}
