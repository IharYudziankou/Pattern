package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.Light;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
