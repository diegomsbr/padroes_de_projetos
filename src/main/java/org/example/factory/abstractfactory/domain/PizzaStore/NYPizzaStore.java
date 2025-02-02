package org.example.factory.abstractfactory.domain.PizzaStore;

import org.example.factory.abstractfactory.domain.pizza.*;
import org.example.factory.abstractfactory.domain.pizza.ny.NYPizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    Pizza pizza;

    PizzaTypeEnum typeEnum = PizzaTypeEnum.fromString(type);

    switch (typeEnum) {
      case CHEESE -> {
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("NY Style Cheese Pizza");
      }
      case VEGGIE -> {
        pizza = new VeggiesPizza(ingredientFactory);
        pizza.setName("NY Style Veggie Pizza");
      }
      case PEPPERONI -> {
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("NY Style Pepperoni Pizza");
      }
      case CLAM -> {
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("NY Style Clam Pizza");
      }
      default -> throw new RuntimeException("Pizza type is no allowed");
    }

    return pizza;
  }
}
