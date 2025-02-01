package org.example.strategy.domain.model;

import org.example.strategy.domain.model.impl.fly.FlyWithWings;
import org.example.strategy.domain.model.impl.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display(){
        System.out.println("I'm a real Mallard Duck");
    }

}
