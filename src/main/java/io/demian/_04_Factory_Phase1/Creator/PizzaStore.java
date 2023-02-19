package io.demian._04_Factory_Phase1.Creator;

import io.demian._04_Factory_Phase1.Factory.SimplePizzaFactory;
import io.demian._04_Factory_Phase1.Product.Pizza;

public class PizzaStore {
	SimplePizzaFactory factory;
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
