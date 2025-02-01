package org.example.factory.factorymethod;

import org.example.factory.factorymethod.domain.PizzaStore.ChicagoPizzaStore;
import org.example.factory.factorymethod.domain.PizzaStore.NYPizzaStore;
import org.example.factory.factorymethod.domain.PizzaStore.PizzaStore;

public class FactoryMethod {

  public static void main(String[] args) {

    PizzaStore nyPizzaStore = new NYPizzaStore();
    nyPizzaStore.orderPizza("cheese");

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    chicagoPizzaStore.orderPizza("cheese");

  }
}
