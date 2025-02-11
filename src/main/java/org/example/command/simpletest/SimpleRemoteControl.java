package org.example.command.simpletest;

import org.example.command.domain.command.Command;

public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
