package com.headfirstlabs.hfdp.template.duck;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(final String name, final int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(final Object o) {
        final Duck otherDuck = (Duck) o;
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
