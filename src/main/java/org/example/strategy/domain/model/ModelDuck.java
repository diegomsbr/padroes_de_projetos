package org.example.strategy.domain.model;

import org.example.strategy.domain.model.impl.quack.Quack;
import org.example.strategy.domain.model.impl.fly.FlyNoWay;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display(){
        System.out.println("I'm a model duck!");
    }
}
