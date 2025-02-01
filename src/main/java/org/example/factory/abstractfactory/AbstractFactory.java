package org.example.factory.abstractfactory;

import org.example.factory.abstractfactory.domain.PizzaStore.ChicagoPizzaStore;
import org.example.factory.abstractfactory.domain.PizzaStore.NYPizzaStore;
import org.example.factory.abstractfactory.domain.PizzaStore.PizzaStore;

public class AbstractFactory {

  public static void main(String[] args) {

    PizzaStore nyPizzaStore = new NYPizzaStore();
    nyPizzaStore.orderPizza("cheese");

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    chicagoPizzaStore.orderPizza("cheese");

  }
}
