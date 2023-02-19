package io.demian._04_Factory_Phase2.Creator;

import io.demian._04_Factory_Phase2.Product.ChicagoStyleCheesePizza;
import io.demian._04_Factory_Phase2.Product.ChicagoStyleClamPizza;
import io.demian._04_Factory_Phase2.Product.ChicagoStylePepperoniPizza;
import io.demian._04_Factory_Phase2.Product.ChicagoStyleVeggiePizza;
import io.demian._04_Factory_Phase2.Product.NYStyleCheesePizza;
import io.demian._04_Factory_Phase2.Product.NYStyleClamPizza;
import io.demian._04_Factory_Phase2.Product.NYStylePepperoniPizza;
import io.demian._04_Factory_Phase2.Product.NYStyleVeggiePizza;
import io.demian._04_Factory_Phase2.Product.Pizza;

public class DependentPizzaStore {
 
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
