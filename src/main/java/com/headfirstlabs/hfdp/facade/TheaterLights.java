package com.headfirstlabs.hfdp.facade;

public class TheaterLights {
    String description;

    public TheaterLights(final String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void dim(final int level) {
        System.out.println(description + " dimming to " + level + "%");
    }

    public String toString() {
        return description;
    }
}
