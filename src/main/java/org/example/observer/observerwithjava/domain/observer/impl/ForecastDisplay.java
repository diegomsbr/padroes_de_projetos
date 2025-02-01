package org.example.observer.observerwithjava.domain.observer.impl;

import org.example.observer.observerwithjava.domain.display.DisplayElement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Flow;


public class ForecastDisplay implements Flow.Subscriber<Map<String, Object>>, DisplayElement {
    private static final String PRESSURE = "pressure";

    private final List<Flow.Subscription> subscriptionList;

    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay() {
        subscriptionList = new CopyOnWriteArrayList<>();
    }


    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        subscriptionList.add(subscription);
    }

    @Override
    public void onNext(Map<String, Object> item) {
        lastPressure = currentPressure;
        currentPressure = (float) item.get(PRESSURE);
        display();
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable);
    }

    @Override
    public void onComplete() {
        System.out.println("Current conditions complete");
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
