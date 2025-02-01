package org.example.observer.observerwithjava;


import org.example.observer.observerwithjava.domain.observer.impl.ForecastDisplay;
import org.example.observer.observerwithjava.domain.observer.impl.HeatIndexDisplay;
import org.example.observer.observerwithjava.domain.observer.impl.CurrentConditionsDisplay;
import org.example.observer.observerwithjava.domain.observer.impl.StatisticsDisplay;
import org.example.observer.observerwithjava.domain.subject.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.subscribe(conditionsDisplay);
        weatherData.subscribe(forecastDisplay);
        weatherData.subscribe(heatIndexDisplay);
        weatherData.subscribe(statisticsDisplay);

        weatherData.setMeasurementsChanged(80, 65, 30.4f);
        weatherData.setMeasurementsChanged(82, 70, 29.2f);
        weatherData.setMeasurementsChanged(78, 90, 29.2f);

    }
}