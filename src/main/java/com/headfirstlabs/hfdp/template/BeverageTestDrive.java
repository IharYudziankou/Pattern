package com.headfirstlabs.hfdp.template;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class BeverageTestDrive {
    public static void main(final String[] args) {
        final TeaWithHook teaHook = new TeaWithHook();
        final CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println();
        System.out.println("Making tea...");
        teaHook.prepareRecipe();

        System.out.println();
        System.out.println("Making coffee...");
        coffeeHook.prepareRecipe();
    }
}
