package com.headfirstlabs.hfdp.strategy;

import com.headfirstlabs.hfdp.strategy.behavior.impl.FlyRocketPowered;
import com.headfirstlabs.hfdp.strategy.duck.Duck;
import com.headfirstlabs.hfdp.strategy.duck.MallardDuck;
import com.headfirstlabs.hfdp.strategy.duck.ModelDuck;

/**
 * Created by Ihar_Yudziankou on 3/29/2017.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
