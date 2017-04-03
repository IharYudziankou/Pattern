package com.headfirstlabs.hfdp.command.command;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(final Command[] commands) {
        this.commands = commands;
    }


    @Override
    public void execute() {
        for (final Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (final Command command : commands) {
            command.undo();
        }

    }
}
