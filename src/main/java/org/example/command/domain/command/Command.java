package org.example.command.domain.command;

public interface Command {
    public void execute();
    public void undo();
}
