package org.example.command.domain.automations;

public class Ligth {

  private final String location;

  public Ligth() {
    this.location = "unknown";
  }

  public Ligth(String location) {
    this.location = location;
  }

  public void on() {
    System.out.printf("Light from %s is on%n", location);
  }

  public void off() {
    System.out.printf("Light from %s is off%n", location);
  }
}
