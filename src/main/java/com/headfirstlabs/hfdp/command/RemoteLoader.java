package com.headfirstlabs.hfdp.command;

import com.headfirstlabs.hfdp.command.command.CeilingFanHighCommand;
import com.headfirstlabs.hfdp.command.command.CeilingFanMediumCommand;
import com.headfirstlabs.hfdp.command.command.CeilingFanOffCommand;
import com.headfirstlabs.hfdp.command.command.CeilingFanOnCommand;
import com.headfirstlabs.hfdp.command.command.GarageDoorDownCommand;
import com.headfirstlabs.hfdp.command.command.GarageDoorUpCommand;
import com.headfirstlabs.hfdp.command.command.LightOffCommand;
import com.headfirstlabs.hfdp.command.command.LightOnCommand;
import com.headfirstlabs.hfdp.command.command.StereoOffCommand;
import com.headfirstlabs.hfdp.command.command.StereoOnWithCDCommand;
import com.headfirstlabs.hfdp.command.vendor.CeilingFan;
import com.headfirstlabs.hfdp.command.vendor.GarageDoor;
import com.headfirstlabs.hfdp.command.vendor.Light;
import com.headfirstlabs.hfdp.command.vendor.Stereo;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class RemoteLoader {
    public static void main(final String[] args) {
        final RemoteControl remoteControl = new RemoteControl();

        final Light livingRoomLight = new Light("Living Room");
        final Light kitchenRoomLight = new Light("Kitchen");
        final CeilingFan ceilingFan = new CeilingFan("Living Room");
        final GarageDoor garageDoor = new GarageDoor("");
        final Stereo stereo = new Stereo("Living Room");

        final LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        final LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        final LightOnCommand kitchenLightOn = new LightOnCommand(kitchenRoomLight);
        final LightOffCommand kitchenLightOff = new LightOffCommand(kitchenRoomLight);

        final CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        final CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        final GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        final GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        final StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        final StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        System.out.println("*****************************");

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");

        final CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        final CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }
}
