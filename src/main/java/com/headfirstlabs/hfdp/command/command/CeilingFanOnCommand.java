package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.CeilingFan;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(final CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
