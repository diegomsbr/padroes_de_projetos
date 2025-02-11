package org.example.command.simpletest;

import org.example.command.domain.automations.GarageDoor;
import org.example.command.domain.automations.Ligth;
import org.example.command.domain.command.impl.GarageDoorOpenCommand;
import org.example.command.domain.command.impl.LigthOnCommand;

public class SimpleRemoteControlTest {

    public static void main (String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Ligth ligth = new Ligth();
        GarageDoor garageDoor = new GarageDoor();

        LigthOnCommand lightOn = new LigthOnCommand(ligth);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
