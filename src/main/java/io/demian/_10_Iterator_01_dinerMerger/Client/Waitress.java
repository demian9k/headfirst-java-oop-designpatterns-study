package io.demian._10_Iterator_01_dinerMerger.Client;

import io.demian._10_Iterator_01_dinerMerger.MenuItem;
import io.demian._10_Iterator_01_dinerMerger.aggregate.Menu;
import io.demian._10_Iterator_01_dinerMerger.iterator.Iterator;

/*
 * 웨이트리스 클래스
 * 주문자에게 합병하려는 가게에서 판매하는 메뉴를 알려준다.
 */
public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
 
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	
	//전체 메뉴를 주문자에게 알려주는 기능
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();

		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);

	}
	
	/*
	 * 매개변수 Iterator에 있는 메뉴를 주문자에게 알려주는 기능
	 */
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	/*
	 * 채식주의자용 메뉴를 주문자에게 알려주는 기능
	 * printVegetarianMenu를 감싸고 있다.
	 * 나중에 다른 식당이 추가되면 변경되어야 한다.
	 */
	public void printVegetarianMenu() {
		printVegetarianMenu(pancakeHouseMenu.createIterator());
		printVegetarianMenu(dinerMenu.createIterator());
	}
	
	//채식주의자용 메뉴를 주문자에게 알려주는 메서드
	private void printVegetarianMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.isVegetarian()) {
				System.out.print(menuItem.getName());
				System.out.println("\t\t" + menuItem.getPrice());
				System.out.println("\t" + menuItem.getDescription());
			}
		}
	}
	
	/*
	 * 채식주의자용 메뉴인지 확인하는 메서드
	 * isVegetarian 메서드를 감싸고 있다.
	 * 다른 식당이 추가되면 바뀌어야 한다.
	 */
	public boolean isItemVegetarian(String name) {
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		if (isVegetarian(name, breakfastIterator)) {
			return true;
		}
		Iterator dinnerIterator = dinerMenu.createIterator();
		if (isVegetarian(name, dinnerIterator)) {
			return true;
		}
		return false;
	}
	
	
	//메뉴가 채식주의자용 메뉴인지 확인하는 메서드
	private boolean isVegetarian(String name, Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}
}
