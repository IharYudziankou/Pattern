package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.TV;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(final TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
