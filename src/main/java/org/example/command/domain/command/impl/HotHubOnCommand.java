package org.example.command.domain.command.impl;

import org.example.command.domain.automations.HotHub;
import org.example.command.domain.command.Command;

public class HotHubOnCommand implements Command {

  private final HotHub hotHub;

  public HotHubOnCommand(HotHub hotHub) {
    this.hotHub = hotHub;
  }

  @Override
  public void execute() {
    hotHub.on();
  }

  @Override
  public void undo() {
    hotHub.off();
  }
}
