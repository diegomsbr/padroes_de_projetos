package org.example.command.domain.command.impl;

import org.example.command.domain.automations.TV;
import org.example.command.domain.command.Command;

public class TVOffCommand implements Command {

  private final TV tv;

  public TVOffCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.off();
  }

  @Override
  public void undo() {

    tv.on();
  }
}
