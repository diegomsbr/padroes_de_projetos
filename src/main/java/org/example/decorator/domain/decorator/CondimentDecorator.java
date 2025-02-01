package org.example.decorator.domain.decorator;

import org.example.decorator.domain.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
