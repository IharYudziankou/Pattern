package com.headfirstlabs.hfdp.command;

import com.headfirstlabs.hfdp.command.command.Command;
import com.headfirstlabs.hfdp.command.command.HottubOffCommand;
import com.headfirstlabs.hfdp.command.command.HottubOnCommand;
import com.headfirstlabs.hfdp.command.command.LightOffCommand;
import com.headfirstlabs.hfdp.command.command.LightOnCommand;
import com.headfirstlabs.hfdp.command.command.MacroCommand;
import com.headfirstlabs.hfdp.command.command.StereoOffCommand;
import com.headfirstlabs.hfdp.command.command.StereoOnCommand;
import com.headfirstlabs.hfdp.command.command.TVOffCommand;
import com.headfirstlabs.hfdp.command.command.TVOnCommand;
import com.headfirstlabs.hfdp.command.vendor.Hottub;
import com.headfirstlabs.hfdp.command.vendor.Light;
import com.headfirstlabs.hfdp.command.vendor.Stereo;
import com.headfirstlabs.hfdp.command.vendor.TV;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class RemoteLoaderParty {
    public static void main(final String[] args) {
        final RemoteControl remoteControl = new RemoteControl();

        final Light livingRoomLight = new Light("Living Room");
        final TV tv = new TV("Living Room");
        final Stereo stereo = new Stereo("Living Room");
        final Hottub hottub = new Hottub();

        final LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        final StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        final TVOnCommand tvOn = new TVOnCommand(tv);
        final HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        final LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        final StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        final TVOffCommand tvOff = new TVOffCommand(tv);
        final HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        final Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        final Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        final MacroCommand partyOnMacro = new MacroCommand(partyOn);
        final MacroCommand partyOffMacro = new MacroCommand(partyOff);


        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
