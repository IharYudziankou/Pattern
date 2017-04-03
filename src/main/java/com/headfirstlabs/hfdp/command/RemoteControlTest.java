package com.headfirstlabs.hfdp.command;

import com.headfirstlabs.hfdp.command.command.LightOnCommand;
import com.headfirstlabs.hfdp.command.vendor.GarageDoor;
import com.headfirstlabs.hfdp.command.vendor.Light;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class RemoteControlTest {
    public static void main(final String[] args) {
        final SimpleRemoteControl remote = new SimpleRemoteControl();
        final Light light = new Light("");
        final GarageDoor garageDoor = new GarageDoor("");
        final LightOnCommand lightOn = new LightOnCommand(light);
        final GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
