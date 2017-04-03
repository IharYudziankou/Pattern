package com.headfirstlabs.hfdp.command.command;

/**
 * Created by Ihar_Yudziankou on 4/3/2017.
 */
public interface Command {
    void execute();

    void undo();
}
