package org.example.factory.factorymethod.domain.PizzaStore;

import org.example.factory.factorymethod.domain.pizza.chicago.ChicagoPizzaTypeEnum;
import org.example.factory.factorymethod.domain.pizza.Pizza;
import org.example.factory.factorymethod.domain.pizza.chicago.ChicagoCheesePizza;
import org.example.factory.factorymethod.domain.pizza.chicago.ChicagoPepperoniPizza;
import org.example.factory.factorymethod.domain.pizza.chicago.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    Pizza pizza;

    ChicagoPizzaTypeEnum typeEnum = ChicagoPizzaTypeEnum.fromString(type);

    switch (typeEnum) {
      case CHEESE -> pizza = new ChicagoCheesePizza();
      case VEGGIE -> pizza = new ChicagoVeggiePizza();
      case PEPPERONI -> pizza = new ChicagoPepperoniPizza();
      default -> throw new RuntimeException("Pizza type is no allowed");
    }

    return pizza;
  }
}
