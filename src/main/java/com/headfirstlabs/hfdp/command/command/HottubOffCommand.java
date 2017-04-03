package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.Hottub;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class HottubOffCommand implements Command {
    private Hottub hottub;

    public HottubOffCommand(final Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
