package io.demian._10_Iterator_01_dinerMerger.aggregate;

import java.util.ArrayList;

import io.demian._10_Iterator_01_dinerMerger.MenuItem;
import io.demian._10_Iterator_01_dinerMerger.iterator.Iterator;
import io.demian._10_Iterator_01_dinerMerger.iterator.PancakeHouseMenuIterator;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems; //팬케이크 하우스에서는 메뉴를 담는 데 ArrayList 를 사용한다.
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("K&B's Pancake Breakfast", 
			"Pancakes with scrambled eggs, and toast", 
			true,
			2.99);
 
		addItem("Regular Pancake Breakfast", 
			"Pancakes with fried eggs, sausage", 
			false,
			2.99);
 
		addItem("Blueberry Pancakes",
			"Pancakes made with fresh blueberries",
			true,
			3.49);
 
		addItem("Waffles",
			"Waffles, with your choice of blueberries or strawberries",
			true,
			3.59);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
  
	public String toString() {
		return "Objectville Pancake House Menu";
	}

	// other menu methods here
}
