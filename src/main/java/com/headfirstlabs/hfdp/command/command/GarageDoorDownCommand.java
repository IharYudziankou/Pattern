package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.GarageDoor;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
