package io.demian._09_TemplateMethod_02_Barista;

import io.demian._09_TemplateMethod_02_Barista.CaffeineBeverage.Coffee;
import io.demian._09_TemplateMethod_02_Barista.CaffeineBeverage.Tea;
import io.demian._09_TemplateMethod_02_Barista.CaffeineBeverageWithHook.CoffeeWithHook;
import io.demian._09_TemplateMethod_02_Barista.CaffeineBeverageWithHook.TeaWithHook;


public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
