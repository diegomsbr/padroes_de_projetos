package org.example.command.domain.automations;

public class TV {

    private final String location;

    public TV() {
        location = "unknown";
    }

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.printf("TV from %s is on%n", location);
    }

    public void off() {
        System.out.printf("TV from %s is off%n", location);
    }

    public void setInputChannel() {
        System.out.printf("Input channel from %s is set%n", location);
    }

    public void setVolume(int volume) {
        System.out.printf("Volume from %s is set to " + volume + "%n", location);
    }

}
