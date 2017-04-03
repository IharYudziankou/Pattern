package com.headfirstlabs.hfdp.command;

import com.headfirstlabs.hfdp.command.command.Command;
import com.headfirstlabs.hfdp.command.command.NoCommand;

import java.util.stream.IntStream;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        final Command noCommand = new NoCommand();
        onCommands = IntStream.range(0, 7).mapToObj(i -> noCommand).toArray(Command[]::new);
        offCommands = IntStream.range(0, 7).mapToObj(i -> noCommand).toArray(Command[]::new);
        undoCommand = noCommand;
    }

    public void setCommand(final int slot, final Command onCommand, final Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(final int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(final int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        final StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");

        return stringBuff.toString();
    }
}
