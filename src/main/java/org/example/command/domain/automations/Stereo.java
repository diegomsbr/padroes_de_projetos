package org.example.command.domain.automations;

public class Stereo {

    private final String location;

    public Stereo() {
        location = "unknown";
    }

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.printf("Stereo from %s is on%n", location);
    }

    public void off() {
        System.out.printf("Stereo from %s is off%n", location);
    }

    public void setCD() {
        System.out.printf("CD from %s is set%n", location);
    }

    public void setDVD() {
        System.out.printf("DVD from %s is set%n", location);
    }

    public void setRadio() {
        System.out.printf("Radio from %s is set%n", location);
    }

    public void setVolume(int volume) {
        System.out.printf("Volume from %s is set to " + volume + "%n", location);
    }
}
