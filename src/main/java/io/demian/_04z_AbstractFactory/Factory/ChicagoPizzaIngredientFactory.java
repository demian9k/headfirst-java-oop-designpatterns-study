package io.demian._04z_AbstractFactory.Factory;

import io.demian._04z_AbstractFactory.Product.Indegrient.BlackOlives;
import io.demian._04z_AbstractFactory.Product.Indegrient.Cheese;
import io.demian._04z_AbstractFactory.Product.Indegrient.Clams;
import io.demian._04z_AbstractFactory.Product.Indegrient.Dough;
import io.demian._04z_AbstractFactory.Product.Indegrient.Eggplant;
import io.demian._04z_AbstractFactory.Product.Indegrient.FrozenClams;
import io.demian._04z_AbstractFactory.Product.Indegrient.MozzarellaCheese;
import io.demian._04z_AbstractFactory.Product.Indegrient.Pepperoni;
import io.demian._04z_AbstractFactory.Product.Indegrient.PlumTomatoSauce;
import io.demian._04z_AbstractFactory.Product.Indegrient.Sauce;
import io.demian._04z_AbstractFactory.Product.Indegrient.SlicedPepperoni;
import io.demian._04z_AbstractFactory.Product.Indegrient.Spinach;
import io.demian._04z_AbstractFactory.Product.Indegrient.ThickCrustDough;
import io.demian._04z_AbstractFactory.Product.Indegrient.Veggies;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
