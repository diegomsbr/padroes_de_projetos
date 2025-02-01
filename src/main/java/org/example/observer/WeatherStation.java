package org.example.observer;


import org.example.observer.domain.observer.impl.CurrentConditionsDisplay;
import org.example.observer.domain.observer.impl.ForecastDisplay;
import org.example.observer.domain.observer.impl.HeatIndexDisplay;
import org.example.observer.domain.observer.impl.StatisticsDisplay;
import org.example.observer.domain.subject.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(heatIndexDisplay);

        weatherData.setMeasurementsChanged(80, 65, 30.4f);
        weatherData.setMeasurementsChanged(82, 70, 29.2f);
        weatherData.setMeasurementsChanged(78, 90, 29.2f);
    }
}