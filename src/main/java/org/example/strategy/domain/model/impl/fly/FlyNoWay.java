package org.example.strategy.domain.model.impl.fly;

import org.example.strategy.domain.model.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    public void fly(){
        System.out.println("I can't fly!!");
    }
}
