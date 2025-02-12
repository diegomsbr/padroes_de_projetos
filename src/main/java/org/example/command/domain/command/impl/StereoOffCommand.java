package org.example.command.domain.command.impl;

import org.example.command.domain.automations.Stereo;
import org.example.command.domain.command.Command;

public class StereoOffCommand implements Command {

  private final Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.off();
  }

  @Override
  public void undo() {
    stereo.on();
  }
}
