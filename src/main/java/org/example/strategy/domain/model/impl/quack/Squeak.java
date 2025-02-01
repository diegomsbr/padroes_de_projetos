package org.example.strategy.domain.model.impl.quack;

import org.example.strategy.domain.model.QuackBehavior;

public class Squeak implements QuackBehavior {

    public void quack() {
        System.out.println("Squeak");
    }
}
