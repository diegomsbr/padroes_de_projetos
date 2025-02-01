package org.example.factory.simplefactory;

import org.example.factory.simplefactory.domain.pizza.PizzaTypeEnum;
import org.example.factory.simplefactory.domain.PizzaStore.PizzaStore;
import org.example.factory.simplefactory.domain.pizza.factory.SimplePizzaFactory;

public class SimpleFactory {

  public static void main(String[] args) {

    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore pizzaStore = new PizzaStore(factory);

    pizzaStore.orderPizza(PizzaTypeEnum.CHEESE);
    pizzaStore.orderPizza(PizzaTypeEnum.VEGGIE);
    pizzaStore.orderPizza(PizzaTypeEnum.PEPPERONI);
  }
}
