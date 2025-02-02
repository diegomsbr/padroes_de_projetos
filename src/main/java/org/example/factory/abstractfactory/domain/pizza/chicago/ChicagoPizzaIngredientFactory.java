package org.example.factory.abstractfactory.domain.pizza.chicago;

import java.util.ArrayList;
import java.util.List;
import org.example.factory.abstractfactory.domain.ingredient.*;
import org.example.factory.abstractfactory.domain.ingredient.impl.cheese.MozzarellaCheese;
import org.example.factory.abstractfactory.domain.ingredient.impl.clam.FrozenClam;
import org.example.factory.abstractfactory.domain.ingredient.impl.dough.ThickDough;
import org.example.factory.abstractfactory.domain.ingredient.impl.pepperoni.SlicedPepperoni;
import org.example.factory.abstractfactory.domain.ingredient.impl.sauce.TomatoSauce;
import org.example.factory.abstractfactory.domain.ingredient.impl.veggie.*;
import org.example.factory.abstractfactory.domain.pizza.PizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return new ThickDough();
  }

  @Override
  public Sauce createSauce() {
    return new TomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public List<Veggie> createVeggies() {

    List<Veggie> veggies = new ArrayList<>();
    veggies.add(new Spinach());
    veggies.add(new Eggplant());
    veggies.add(new BlackOlives());
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clam createClam() {
    return new FrozenClam();
  }
}
