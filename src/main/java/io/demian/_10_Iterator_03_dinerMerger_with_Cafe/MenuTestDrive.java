package io.demian._10_Iterator_03_dinerMerger_with_Cafe;

import io.demian._10_Iterator_03_dinerMerger_with_Cafe.Aggregate.CafeMenu;
import io.demian._10_Iterator_03_dinerMerger_with_Cafe.Aggregate.DinerMenu;
import io.demian._10_Iterator_03_dinerMerger_with_Cafe.Aggregate.PancakeHouseMenu;
import io.demian._10_Iterator_03_dinerMerger_with_Cafe.Client.Waitress;

public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
 
		waitress.printMenu();
		waitress.printVegetarianMenu();

		System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("Hotdog")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nCustomer asks, are the Waffles vegetarian?");
		System.out.print("Waitress says: ");
		if (waitress.isItemVegetarian("Waffles")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
