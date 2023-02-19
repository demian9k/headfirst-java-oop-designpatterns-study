package io.demian._04z_AbstractFactory.Creator;

import io.demian._04z_AbstractFactory.Factory.NYPizzaIngredientFactory;
import io.demian._04z_AbstractFactory.Factory.PizzaIngredientFactory;
import io.demian._04z_AbstractFactory.Product.CheesePizza;
import io.demian._04z_AbstractFactory.Product.ClamPizza;
import io.demian._04z_AbstractFactory.Product.PepperoniPizza;
import io.demian._04z_AbstractFactory.Product.Pizza;
import io.demian._04z_AbstractFactory.Product.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
