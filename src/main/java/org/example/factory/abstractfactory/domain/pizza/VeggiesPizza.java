package org.example.factory.abstractfactory.domain.pizza;

public class VeggiesPizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;

  public VeggiesPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println();
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    veggies = ingredientFactory.createVeggies();
  }
}
