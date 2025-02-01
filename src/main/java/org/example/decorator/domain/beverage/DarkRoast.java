package org.example.decorator.domain.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
