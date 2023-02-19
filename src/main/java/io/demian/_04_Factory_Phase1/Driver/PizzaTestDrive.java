package io.demian._04_Factory_Phase1.Driver;

import io.demian._04_Factory_Phase1.Creator.PizzaStore;
import io.demian._04_Factory_Phase1.Factory.SimplePizzaFactory;
import io.demian._04_Factory_Phase1.Product.Pizza;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
