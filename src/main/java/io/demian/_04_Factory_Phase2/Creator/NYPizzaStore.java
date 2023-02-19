package io.demian._04_Factory_Phase2.Creator;

import io.demian._04_Factory_Phase2.Product.NYStyleCheesePizza;
import io.demian._04_Factory_Phase2.Product.NYStyleClamPizza;
import io.demian._04_Factory_Phase2.Product.NYStylePepperoniPizza;
import io.demian._04_Factory_Phase2.Product.NYStyleVeggiePizza;
import io.demian._04_Factory_Phase2.Product.Pizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
