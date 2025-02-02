package org.example.factory.abstractfactory.domain.pizza.ny;

import org.example.factory.abstractfactory.domain.ingredient.*;
import org.example.factory.abstractfactory.domain.ingredient.impl.clam.FreshClam;
import org.example.factory.abstractfactory.domain.ingredient.impl.pepperoni.SlicedPepperoni;
import org.example.factory.abstractfactory.domain.ingredient.impl.sauce.MarinaraSauce;
import org.example.factory.abstractfactory.domain.ingredient.impl.cheese.ReggianoCheese;
import org.example.factory.abstractfactory.domain.ingredient.impl.dough.ThimCrustDough;
import org.example.factory.abstractfactory.domain.ingredient.impl.veggie.Garlic;
import org.example.factory.abstractfactory.domain.ingredient.impl.veggie.Mushroom;
import org.example.factory.abstractfactory.domain.ingredient.impl.veggie.Onion;
import org.example.factory.abstractfactory.domain.ingredient.impl.veggie.RedPepper;
import org.example.factory.abstractfactory.domain.pizza.PizzaIngredientFactory;

import java.util.ArrayList;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return new ThimCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public List<Veggie> createVeggies() {

    List<Veggie> veggies = new ArrayList<>();
    veggies.add(new Garlic());
    veggies.add(new Onion());
    veggies.add(new Mushroom());
    veggies.add(new RedPepper());
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clam createClam() {
    return new FreshClam();
  }
}
