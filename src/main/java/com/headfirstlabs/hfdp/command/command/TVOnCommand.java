package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.TV;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(final TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
