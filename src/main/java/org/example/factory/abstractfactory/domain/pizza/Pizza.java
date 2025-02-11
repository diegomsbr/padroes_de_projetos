package org.example.factory.abstractfactory.domain.pizza;

import org.example.factory.abstractfactory.domain.ingredient.*;

import java.util.List;

public abstract class Pizza {

  String name;
  Dough dough;
  Sauce sauce;
  List<Veggie> veggies;
  Cheese cheese;
  Pepperoni pepperoni;
  Clam clam;

  public abstract void prepare();

  public void bake(){
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut(){
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box(){
    System.out.println("Place pizza in official PizzaStore box");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Pizza{" +
            "name='" + name + '\'' +
            ", dough=" + dough +
            ", sauce=" + sauce +
            ", veggies=" + veggies +
            ", cheese=" + cheese +
            ", pepperoni=" + pepperoni +
            ", clam=" + clam +
            '}';
  }
}
