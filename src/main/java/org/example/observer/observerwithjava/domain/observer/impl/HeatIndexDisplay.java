package org.example.observer.observerwithjava.domain.observer.impl;


import org.example.observer.observerwithjava.domain.display.DisplayElement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Flow;

public class HeatIndexDisplay implements Flow.Subscriber<Map<String, Object>>, DisplayElement  {

    private static final String TEMPERATURE = "temperature";
    private static final String HUMIDITY = "humidity";

    private float heatIndex = 0.0f;
    private final List<Flow.Subscription> subscriptionList;

    public HeatIndexDisplay() {
        subscriptionList = new CopyOnWriteArrayList<>();
    }

    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        subscriptionList.add(subscription);
    }

    @Override
    public void onNext(Map<String, Object> item) {

        float t = (float) item.get(TEMPERATURE);
        float rh = (float) item.get(HUMIDITY) ;
        heatIndex = (float)
                (
                        (16.923 + (0.185212 * t)) +
                                (5.37941 * rh) -
                                (0.100254 * t * rh) +
                                (0.00941695 * (t * t)) +
                                (0.00728898 * (rh * rh)) +
                                (0.000345372 * (t * t * rh)) -
                                (0.000814971 * (t * rh * rh)) +
                                (0.0000102102 * (t * t * rh * rh)) -
                                (0.000038646 * (t * t * t)) +
                                (0.0000291583 * (rh * rh * rh)) +
                                (0.00000142721 * (t * t * t * rh)) +
                                (0.000000197483 * (t * rh * rh * rh)) -
                                (0.0000000218429 * (t * t * t * rh * rh)) +
                                (0.000000000843296 * (t * t * rh * rh * rh)) -
                                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        display();
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable);
    }

    @Override
    public void onComplete() {
        System.out.println("Heat Index complete");
    }
}
