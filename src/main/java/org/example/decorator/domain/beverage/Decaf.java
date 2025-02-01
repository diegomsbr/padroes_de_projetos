package org.example.decorator.domain.beverage;

public class Decaf extends Beverage {

    public Decaf() {
        super.description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
