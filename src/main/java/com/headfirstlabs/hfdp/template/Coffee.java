package com.headfirstlabs.hfdp.template;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
