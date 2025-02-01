package org.example.strategy.domain.model.impl.fly;

import org.example.strategy.domain.model.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    public void fly(){
        System.out.println("I'm flying with a rocket!!");
    }
}
