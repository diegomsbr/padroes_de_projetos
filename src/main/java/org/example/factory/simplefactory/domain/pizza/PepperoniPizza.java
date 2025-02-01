package org.example.factory.simplefactory.domain.pizza;

public class PepperoniPizza implements Pizza {

  private static final String PIZZA_TYPE = "PeperoniPizza";

  @Override
  public void prepare() {
    System.out.println();
    System.out.printf("Prepare for %s%n", PIZZA_TYPE);
  }

  @Override
  public void bake() {
    System.out.printf("Bake for %s%n", PIZZA_TYPE);
  }

  @Override
  public void cut() {
    System.out.printf("Cut for %s%n", PIZZA_TYPE);
  }

  @Override
  public void box() {
    System.out.printf("Box for %s%n", PIZZA_TYPE);
  }
}
