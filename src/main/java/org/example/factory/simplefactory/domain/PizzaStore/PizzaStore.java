package org.example.factory.simplefactory.domain.PizzaStore;

import org.example.factory.simplefactory.domain.pizza.Pizza;
import org.example.factory.simplefactory.domain.pizza.PizzaTypeEnum;
import org.example.factory.simplefactory.domain.pizza.factory.SimplePizzaFactory;

public class PizzaStore {

  private final SimplePizzaFactory factory;

  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(PizzaTypeEnum type) {
    Pizza pizza;

    pizza = factory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}
