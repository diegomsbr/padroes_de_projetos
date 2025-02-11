package org.example.command.domain.automations;

public class HotHub {

  public void circulate() {
    System.out.println("HotHub is circulating");
  }

  public void jetsOn() {
    System.out.println("HotHub jets are on");
  }

  public void jetsOff() {
    System.out.println("HotHub jets are off");
  }

  public void setTemperature(int temperature) {
    System.out.println("HotHub temperature is set to " + temperature);
  }
}
