package org.example.command.domain.command.impl;

import org.example.command.domain.automations.Stereo;
import org.example.command.domain.command.Command;

public class StereoOnWithCDCommand implements Command {

  private final Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.on();
    stereo.setCD();
    stereo.setVolume(11);
  }

  @Override
  public void undo() {
    stereo.off();
  }
}
