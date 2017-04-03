package com.headfirstlabs.hfdp.command.vendor;

public class Light {
    String location = "";

    public Light(final String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}
