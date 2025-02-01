package org.example.observer.domain.observer.impl;

import org.example.observer.domain.display.DisplayElement;
import org.example.observer.domain.observer.Observer;
import org.example.observer.domain.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject wheaterDate;

    public CurrentConditionsDisplay(Subject wheatherData) {
        this.wheaterDate = wheatherData;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions %s degrees and %s humidity", temperature, humidity));
    }
}
