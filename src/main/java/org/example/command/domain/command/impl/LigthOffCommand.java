package org.example.command.domain.command.impl;

import org.example.command.domain.automations.Ligth;
import org.example.command.domain.command.Command;

public class LigthOffCommand implements Command {

  private final Ligth ligth;

  public LigthOffCommand(Ligth ligth) {
    this.ligth = ligth;
  }

  @Override
  public void execute() {
    ligth.off();
  }

  @Override
  public void undo() {
    ligth.on();
  }
}
