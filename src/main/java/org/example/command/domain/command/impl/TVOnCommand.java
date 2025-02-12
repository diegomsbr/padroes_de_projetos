package org.example.command.domain.command.impl;

import org.example.command.domain.automations.TV;
import org.example.command.domain.command.Command;

public class TVOnCommand implements Command {

  private final TV tv;

  public TVOnCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.on();
  }

  @Override
  public void undo() {

    tv.off();
  }
}
