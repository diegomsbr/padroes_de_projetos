package org.example.command.domain.command.impl;

import org.example.command.domain.automations.Ligth;
import org.example.command.domain.command.Command;

public class LigthOnCommand implements Command {

    private final Ligth ligth;

    public LigthOnCommand(Ligth ligth) {
        this.ligth = ligth;
    }


    @Override
    public void execute() {
        ligth.on();
    }

    @Override
    public void undo() {
        ligth.off();
    }
}
