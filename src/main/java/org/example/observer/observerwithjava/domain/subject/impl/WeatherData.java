package org.example.observer.observerwithjava.domain.subject.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Flow;

public class WeatherData implements Flow.Publisher<Map<String, Object>> {
    private final List<Flow.Subscriber<? super Map<String, Object>>> subscriberList;

    private static final String TEMPERATURE = "temperature";
    private static final String HUMIDITY = "humidity";
    private static final String PRESSURE = "pressure";


    public WeatherData() {
        subscriberList = new CopyOnWriteArrayList<>();
    }

    public void notifyAllSubscribers(Map<String, Object> weatherDataMap) {

        for (Flow.Subscriber<? super Map<String, Object>> subscribe : subscriberList) {
            subscribe.onNext(weatherDataMap);
        }
    }

    @Override
    public void subscribe(Flow.Subscriber<? super Map<String, Object>> subscriber) {
        this.subscriberList.add(subscriber);
    }

    //todo better receive already map
    public void setMeasurementsChanged(float temperature, float humidity, float pressure) {
        Map<String, Object> weatherDataMap = new HashMap<>();
        weatherDataMap.putIfAbsent(TEMPERATURE, temperature);
        weatherDataMap.putIfAbsent(HUMIDITY, humidity);
        weatherDataMap.putIfAbsent(PRESSURE, pressure);
        notifyAllSubscribers(weatherDataMap);
    }
}
