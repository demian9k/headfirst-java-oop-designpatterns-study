package io.demian._10_Iterator_01_dinerMerger.aggregate;

import io.demian._10_Iterator_01_dinerMerger.MenuItem;
import io.demian._10_Iterator_01_dinerMerger.iterator.DinerMenuIterator;
import io.demian._10_Iterator_01_dinerMerger.iterator.Iterator;

/*
 * diner 는 작은 식당이라는 뜻이다.
 * Menu
 * 이 클래스는 Menu 인터페이스를 구현해 CreateIterator 메서드를 구현해야 하고
 * 
 */
public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems; //diner 에서는 메뉴를 배열로 관리한다.
  
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Vegetarian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT",
			"Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day",
			"Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog",
			"A hot dog, with saurkraut, relish, onions, topped with cheese",
			false, 3.05);
		addItem("Steamed Veggies and Brown Rice",
			"Steamed vegetables over brown rice", true, 3.99);
		addItem("Pasta",
			"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
			true, 3.89);
	}
	
	//메뉴를 추가하는 메서드
	//배열을 사용하기 때문에 메뉴가 늘어날 때 배열을 늘려주는 기능을 갖고 있다.
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
		// To test Alternating menu items, comment out above line,
		// and uncomment the line below.
		//return new AlternatingDinerMenuIterator(menuItems);
	}
 
	// other menu methods here
}
