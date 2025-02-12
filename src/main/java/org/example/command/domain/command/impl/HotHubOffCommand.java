package org.example.command.domain.command.impl;

import org.example.command.domain.automations.HotHub;
import org.example.command.domain.command.Command;

public class HotHubOffCommand implements Command {

  private final HotHub hotHub;

  public HotHubOffCommand(HotHub hotHub) {
    this.hotHub = hotHub;
  }

  @Override
  public void execute() {
    hotHub.off();
  }

  @Override
  public void undo() {
    hotHub.on();
  }
}
