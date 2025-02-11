package org.example.factory.factorymethod.domain.PizzaStore;

import org.example.factory.factorymethod.domain.pizza.Pizza;
import org.example.factory.factorymethod.domain.pizza.ny.NYCheesePizza;
import org.example.factory.factorymethod.domain.pizza.ny.NYPepperoniPizza;
import org.example.factory.factorymethod.domain.pizza.ny.NYPizzaTypeEnum;
import org.example.factory.factorymethod.domain.pizza.ny.NYVeggiePizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    Pizza pizza;

    NYPizzaTypeEnum typeEnum = NYPizzaTypeEnum.fromString(type);

    switch (typeEnum) {
      case CHEESE -> pizza = new NYCheesePizza();
      case VEGGIE -> pizza = new NYVeggiePizza();
      case PEPPERONI -> pizza = new NYPepperoniPizza();
      default -> throw new RuntimeException("Pizza type is no allowed");
    }

    return pizza;
  }
}
