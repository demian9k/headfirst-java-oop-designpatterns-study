package io.demian._10_Iterator_02_dinerMerger_using_JAVA_Iterator;

import io.demian._10_Iterator_02_dinerMerger_using_JAVA_Iterator.Aggregate.DinerMenu;
import io.demian._10_Iterator_02_dinerMerger_using_JAVA_Iterator.Aggregate.PancakeHouseMenu;
import io.demian._10_Iterator_02_dinerMerger_using_JAVA_Iterator.Client.Waitress;

public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
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
