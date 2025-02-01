package org.example.observer.domain.observer.impl;

import org.example.observer.domain.display.DisplayElement;
import org.example.observer.domain.observer.Observer;
import org.example.observer.domain.subject.Subject;


public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure;
    private float lastPressure;
    private Subject wheaterDate;

    public ForecastDisplay(Subject wheatherData) {
        this.wheaterDate = wheatherData;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
