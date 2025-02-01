package org.example.observer.observerwithjava.domain.observer.impl;

import org.example.observer.observerwithjava.domain.display.DisplayElement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Flow;


public class StatisticsDisplay implements Flow.Subscriber<Map<String, Object>>, DisplayElement {

    private static final String TEMPERATURE = "temperature";

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private final List<Flow.Subscription> subscriptionList;

    public StatisticsDisplay() {
        subscriptionList = new CopyOnWriteArrayList<>();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        subscriptionList.add(subscription);
    }

    @Override
    public void onNext(Map<String, Object> item) {
        float temp =  (float) item.get(TEMPERATURE);
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

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable);
    }

    @Override
    public void onComplete() {
        System.out.println("Statistics complete");
    }
}
