package io.demian._04_Factory_Phase2.Creator;

import io.demian._04_Factory_Phase2.Product.ChicagoStyleCheesePizza;
import io.demian._04_Factory_Phase2.Product.ChicagoStyleClamPizza;
import io.demian._04_Factory_Phase2.Product.ChicagoStylePepperoniPizza;
import io.demian._04_Factory_Phase2.Product.ChicagoStyleVeggiePizza;
import io.demian._04_Factory_Phase2.Product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
