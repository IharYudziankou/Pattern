package com.headfirstlabs.hfdp.command.command;

import com.headfirstlabs.hfdp.command.vendor.Stereo;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
