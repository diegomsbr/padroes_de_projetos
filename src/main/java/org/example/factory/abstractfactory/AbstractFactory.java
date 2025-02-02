package org.example.factory.abstractfactory;

import org.example.factory.abstractfactory.domain.PizzaStore.ChicagoPizzaStore;
import org.example.factory.abstractfactory.domain.PizzaStore.NYPizzaStore;
import org.example.factory.abstractfactory.domain.PizzaStore.PizzaStore;
import org.example.factory.abstractfactory.domain.pizza.Pizza;

public class AbstractFactory {

  public static void main(String[] args) {

    Pizza pizza;

    PizzaStore nyPizzaStore = new NYPizzaStore();

    pizza = nyPizzaStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");


    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    pizza = chicagoPizzaStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");

  }
}
