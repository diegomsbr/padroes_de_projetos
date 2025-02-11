package org.example.command;

import org.example.command.domain.automations.*;
import org.example.command.domain.command.impl.*;

public class RemoteLoader {

  public static void main(String[] args) {

    RemoteControl remoteControl = new RemoteControl();

    Ligth livingRoomLigth = new Ligth("Living Room");
    Ligth kitchenLigth = new Ligth("Kitchen");
    CeilingFan ceilingFan = new CeilingFan("Living Room");
    GarageDoor garageDoor = new GarageDoor();
    Stereo stereo = new Stereo("Living Room");

    LigthOnCommand livingRoomLigthOn = new LigthOnCommand(livingRoomLigth);
    LigthOffCommand livingRoomLigthOff = new LigthOffCommand(livingRoomLigth);

    LigthOnCommand kitchenLigthOn = new LigthOnCommand(kitchenLigth);
    LigthOffCommand kitchenLigthOff = new LigthOffCommand(kitchenLigth);

    CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
    CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
    CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
    GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

    StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
    StereoOffCommand stereoOff = new StereoOffCommand(stereo);

    remoteControl.setCommand(0, livingRoomLigthOn, livingRoomLigthOff);
    remoteControl.setCommand(1, kitchenLigthOn, kitchenLigthOff);
    remoteControl.setCommand(2, ceilingFanLow, ceilingFanOff);
    remoteControl.setCommand(3, ceilingFanMedium, ceilingFanOff);
    remoteControl.setCommand(4, ceilingFanHigh, ceilingFanOff);
    remoteControl.setCommand(5, garageDoorUp, garageDoorDown);
    remoteControl.setCommand(6, stereoOnWithCD, stereoOff);

    System.out.println(remoteControl);

    System.out.println("------");
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    System.out.println(remoteControl.getUndoCommand());
    remoteControl.undoButtonWasPushed();
    System.out.println("------");

    remoteControl.onButtonWasPushed(1);
    System.out.println(remoteControl.getUndoCommand());
    remoteControl.undoButtonWasPushed();
    remoteControl.offButtonWasPushed(1);
    System.out.println("------");

    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    System.out.println(remoteControl.getUndoCommand());
    remoteControl.undoButtonWasPushed();
    System.out.println("------");

    remoteControl.onButtonWasPushed(3);
    System.out.println(remoteControl.getUndoCommand());
    remoteControl.undoButtonWasPushed();
    remoteControl.offButtonWasPushed(3);
    System.out.println("------");

    remoteControl.onButtonWasPushed(4);
    System.out.println(remoteControl.getUndoCommand());
    remoteControl.undoButtonWasPushed();
    remoteControl.offButtonWasPushed(4);
    System.out.println("------");

    remoteControl.onButtonWasPushed(5);
    remoteControl.offButtonWasPushed(5);
    System.out.println(remoteControl.getUndoCommand());
    remoteControl.undoButtonWasPushed();
    System.out.println("------");

    remoteControl.onButtonWasPushed(6);
    remoteControl.offButtonWasPushed(6);
    System.out.println("------");
  }
}
