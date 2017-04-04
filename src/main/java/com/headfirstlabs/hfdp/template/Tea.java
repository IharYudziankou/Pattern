package com.headfirstlabs.hfdp.template;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
