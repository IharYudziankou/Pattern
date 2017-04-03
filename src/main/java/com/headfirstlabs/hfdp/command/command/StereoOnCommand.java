package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.Stereo;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class StereoOnCommand extends StereoOnWithCDCommand {

    public StereoOnCommand(final Stereo stereo) {
        super(stereo);
    }

    @Override
    public void execute() {
    }
}
