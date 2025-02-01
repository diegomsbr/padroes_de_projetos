package org.example.observer.domain.observer.impl;

import org.example.observer.domain.display.DisplayElement;
import org.example.observer.domain.observer.Observer;
import org.example.observer.domain.subject.Subject;


public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Subject wheaterDate;

    public StatisticsDisplay(Subject wheatherData) {
        this.wheaterDate = wheatherData;
    }

    public void update(float temperature, float humidity, float pressure) {

        float temp = temperature;
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();

    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
