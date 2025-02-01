package org.example.factory.abstractfactory.domain.pizza;

import org.example.factory.abstractfactory.domain.ingredient.*;

import java.util.List;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public List<Veggie> createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
