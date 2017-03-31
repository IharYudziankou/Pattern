package com.headfirstlabs.hfdp.decorator;

import com.headfirstlabs.hfdp.decorator.Beverage;
import com.headfirstlabs.hfdp.decorator.coffee.DarkRoast;
import com.headfirstlabs.hfdp.decorator.coffee.Espresso;
import com.headfirstlabs.hfdp.decorator.coffee.HouseBlend;
import com.headfirstlabs.hfdp.decorator.condiment.Mocha;
import com.headfirstlabs.hfdp.decorator.condiment.Soy;
import com.headfirstlabs.hfdp.decorator.condiment.Whip;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Beverage.SIZE_M);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast(Beverage.SIZE_M);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend(Beverage.SIZE_M);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
