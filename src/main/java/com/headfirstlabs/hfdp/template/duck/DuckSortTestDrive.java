package com.headfirstlabs.hfdp.template.duck;

import java.util.Arrays;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class DuckSortTestDrive {
    public static void main(final String[] args) {
        final Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2),
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println();
        System.out.println("After sorting:");
        display(ducks);
    }

    private static void display(final Duck[] ducks) {
        for (final Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
