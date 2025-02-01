package org.example.observer.observerwithjava.domain.observer.impl;

import org.example.observer.observerwithjava.domain.display.DisplayElement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Flow;

public class CurrentConditionsDisplay implements Flow.Subscriber<Map<String, Object>>, DisplayElement {

    private static final String TEMPERATURE = "temperature";
    private static final String HUMIDITY = "humidity";

    private float temperature;
    private float humidity;

    private final List<Flow.Subscription> subscriptionList;

    public CurrentConditionsDisplay() {
        subscriptionList = new CopyOnWriteArrayList<>();
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        subscriptionList.add(subscription);
    }

    @Override
    public void onNext(Map<String, Object> item) {
        this.temperature = (float) item.get(TEMPERATURE);
        this.humidity = (float) item.get(HUMIDITY);
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
        System.out.println(String.format("Current conditions %s degrees and %s humidity", temperature, humidity));
    }

}
