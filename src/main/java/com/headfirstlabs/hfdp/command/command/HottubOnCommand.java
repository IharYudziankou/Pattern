package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.Hottub;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class HottubOnCommand implements Command {
    private Hottub hottub;

    public HottubOnCommand(final Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.setTemperature(104);
        hottub.on();
        hottub.circulate();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
