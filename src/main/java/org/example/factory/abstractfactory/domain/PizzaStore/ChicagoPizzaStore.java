package org.example.factory.abstractfactory.domain.PizzaStore;

import org.example.factory.abstractfactory.domain.pizza.*;
import org.example.factory.abstractfactory.domain.pizza.chicago.ChicagoPizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    ChicagoPizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    Pizza pizza;

    PizzaTypeEnum typeEnum = PizzaTypeEnum.fromString(type);

    switch (typeEnum) {
      case CHEESE -> {
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("Chicago Style Cheese Pizza");
      }
      case VEGGIE -> {
        pizza = new VeggiesPizza(ingredientFactory);
        pizza.setName("Chicago Style Veggie Pizza");
      }
      case PEPPERONI -> {
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("Chicago Style Pepperoni Pizza");
      }
      case CLAM -> {
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("Chicago Style Clam Pizza");
      }
      default -> throw new RuntimeException("Pizza type is no allowed");
    }

    return pizza;
  }
}
