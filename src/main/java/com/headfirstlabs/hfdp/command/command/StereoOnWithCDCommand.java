package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.Stereo;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
