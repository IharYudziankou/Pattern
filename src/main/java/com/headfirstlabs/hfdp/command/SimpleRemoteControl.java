package com.headfirstlabs.hfdp.command;

import com.headfirstlabs.hfdp.command.command.Command;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }
    public void buttonWasPressed() {
        slot.execute();
    }
}
