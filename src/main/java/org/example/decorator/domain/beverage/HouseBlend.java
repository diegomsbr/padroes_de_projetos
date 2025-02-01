package org.example.decorator.domain.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}

