package org.example.factory.factorymethod.domain.PizzaStore;

import org.example.factory.factorymethod.domain.pizza.Pizza;

public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza;

    pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  abstract Pizza createPizza(String type);
}
