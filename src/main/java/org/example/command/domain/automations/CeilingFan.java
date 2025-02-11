package org.example.command.domain.automations;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private final String Location;
    private int speed;

    public CeilingFan() {
        Location = "unknown";
    }

    public CeilingFan(String location) {
        Location = location;
    }

    public void off() {
        speed = OFF;
        System.out.printf("Ceiling fan from %s is off%n", Location);
    }

    public void high() {
        speed = HIGH;
        System.out.printf("Ceiling fan from %s is on high speed%n", Location);
    }

    public void medium() {
        speed = MEDIUM;
        System.out.printf("Ceiling fan from %s is on medium speed%n", Location);
    }

    public void low() {
        speed = LOW;
        System.out.printf("Ceiling fan from %s is on low speed%n", Location);
    }

    public int getSpeed() {
        return speed;
    }
}
