package com.headfirstlabs.hfdp.command;

import com.headfirstlabs.hfdp.command.command.Command;
import com.headfirstlabs.hfdp.command.vendor.GarageDoor;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor slot;

    public GarageDoorOpenCommand(final GarageDoor garageDoor) {
        this.slot = garageDoor;
    }

    @Override
    public void execute() {
        slot.up();
    }

    @Override
    public void undo() {
        
    }
}
