package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.GarageDoor;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
