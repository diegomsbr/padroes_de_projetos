package org.example.command.domain.command.impl;

import org.example.command.domain.automations.GarageDoor;
import org.example.command.domain.command.Command;

public class GarageDoorDownCommand implements Command {

  private final GarageDoor garageDoor;

  public GarageDoorDownCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    garageDoor.down();
  }

  @Override
  public void undo() {
    garageDoor.up();
  }
}
