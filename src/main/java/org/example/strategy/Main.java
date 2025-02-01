package org.example.strategy;

import org.example.strategy.domain.model.Duck;
import org.example.strategy.domain.model.MallardDuck;
import org.example.strategy.domain.model.ModelDuck;
import org.example.strategy.domain.model.impl.fly.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.display();
    }
}