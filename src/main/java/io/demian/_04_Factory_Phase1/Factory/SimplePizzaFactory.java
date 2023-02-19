package io.demian._04_Factory_Phase1.Factory;

import io.demian._04_Factory_Phase1.Product.CheesePizza;
import io.demian._04_Factory_Phase1.Product.ClamPizza;
import io.demian._04_Factory_Phase1.Product.PepperoniPizza;
import io.demian._04_Factory_Phase1.Product.Pizza;
import io.demian._04_Factory_Phase1.Product.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
