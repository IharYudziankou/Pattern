package com.headfirstlabs.hfdp.adapter;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class DuckTestDrive {
    public static void main(final String[] args) {
        final MallardDuck duck = new MallardDuck();

        final WildTurkey turkey = new WildTurkey();
        final Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println();
        System.out.println("The Duck says...");
        testDuck(duck);

        System.out.println();
        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(final Duck duck) {
        duck.quack();
        duck.fly();
    }
}
