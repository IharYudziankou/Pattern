package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.CeilingFan;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;

    private int prevSpeed;

    public CeilingFanHighCommand(final CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
