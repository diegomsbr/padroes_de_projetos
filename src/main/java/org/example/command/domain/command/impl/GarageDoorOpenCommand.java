package org.example.command.domain.command.impl;

import org.example.command.domain.automations.GarageDoor;
import org.example.command.domain.command.Command;

public class GarageDoorOpenCommand implements Command {

  private final GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.up();
  }

  @Override
  public void undo() {
    garageDoor.down();
  }
}
