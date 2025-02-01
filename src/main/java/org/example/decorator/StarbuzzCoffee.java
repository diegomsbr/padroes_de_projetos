package org.example.decorator;


import org.example.decorator.domain.beverage.Beverage;
import org.example.decorator.domain.beverage.DarkRoast;
import org.example.decorator.domain.beverage.Espresso;
import org.example.decorator.domain.beverage.HouseBlend;
import org.example.decorator.domain.decorator.Mocha;
import org.example.decorator.domain.decorator.Soy;
import org.example.decorator.domain.decorator.Whip;
import org.example.observer.domain.observer.impl.CurrentConditionsDisplay;
import org.example.observer.domain.observer.impl.ForecastDisplay;
import org.example.observer.domain.observer.impl.HeatIndexDisplay;
import org.example.observer.domain.observer.impl.StatisticsDisplay;
import org.example.observer.domain.subject.impl.WeatherData;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());


    }
}