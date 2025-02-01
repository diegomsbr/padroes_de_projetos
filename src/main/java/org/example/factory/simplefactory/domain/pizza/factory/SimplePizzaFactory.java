package org.example.factory.simplefactory.domain.pizza.factory;

import org.example.factory.simplefactory.domain.pizza.*;
import org.example.simplefactory.domain.pizza.*;

public class SimplePizzaFactory {

    Pizza pizza;

    public Pizza createPizza(PizzaTypeEnum type){
        switch (type) {
            case CHEESE -> pizza = new CheesePizza();
            case VEGGIE -> pizza = new VeggiePizza();
            case PEPPERONI -> pizza = new PepperoniPizza();
            default -> throw new RuntimeException("Pizza type is invalid");
        }

        return pizza;
    }
}
