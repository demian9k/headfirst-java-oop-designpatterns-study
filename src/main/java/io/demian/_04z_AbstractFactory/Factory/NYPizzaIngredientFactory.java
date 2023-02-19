package io.demian._04z_AbstractFactory.Factory;

import io.demian._04z_AbstractFactory.Product.Indegrient.Cheese;
import io.demian._04z_AbstractFactory.Product.Indegrient.Clams;
import io.demian._04z_AbstractFactory.Product.Indegrient.Dough;
import io.demian._04z_AbstractFactory.Product.Indegrient.FreshClams;
import io.demian._04z_AbstractFactory.Product.Indegrient.Garlic;
import io.demian._04z_AbstractFactory.Product.Indegrient.MarinaraSauce;
import io.demian._04z_AbstractFactory.Product.Indegrient.Mushroom;
import io.demian._04z_AbstractFactory.Product.Indegrient.Onion;
import io.demian._04z_AbstractFactory.Product.Indegrient.Pepperoni;
import io.demian._04z_AbstractFactory.Product.Indegrient.RedPepper;
import io.demian._04z_AbstractFactory.Product.Indegrient.ReggianoCheese;
import io.demian._04z_AbstractFactory.Product.Indegrient.Sauce;
import io.demian._04z_AbstractFactory.Product.Indegrient.SlicedPepperoni;
import io.demian._04z_AbstractFactory.Product.Indegrient.ThinCrustDough;
import io.demian._04z_AbstractFactory.Product.Indegrient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
