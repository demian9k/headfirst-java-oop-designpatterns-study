package io.demian._04z_AbstractFactory.Factory;

import io.demian._04z_AbstractFactory.Product.Indegrient.Cheese;
import io.demian._04z_AbstractFactory.Product.Indegrient.Clams;
import io.demian._04z_AbstractFactory.Product.Indegrient.Dough;
import io.demian._04z_AbstractFactory.Product.Indegrient.Pepperoni;
import io.demian._04z_AbstractFactory.Product.Indegrient.Sauce;
import io.demian._04z_AbstractFactory.Product.Indegrient.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
