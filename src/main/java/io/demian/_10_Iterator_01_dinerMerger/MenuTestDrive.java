package io.demian._10_Iterator_01_dinerMerger;

import java.util.*;

import io.demian._10_Iterator_01_dinerMerger.Client.Waitress;
import io.demian._10_Iterator_01_dinerMerger.aggregate.DinerMenu;
import io.demian._10_Iterator_01_dinerMerger.aggregate.PancakeHouseMenu;

public class MenuTestDrive {
	public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
 
		// Without iterators
		//printMenu();
		
		// With iterators
		waitress.printMenu();
		
	}
	
	/*
	 * 이터레이터 없이 메뉴를 주문자에게 알려주는 방법(Anti-Pattern)
	 * 팬케이크 하우스와 식당의 메뉴들의 구조가 다르므로 반복문을 따로 구성해야 한다.
	 * 이런 이유로 웨이트리스 클래스(주문자에게 메뉴를 알려주는 방법을 캡슐화한 클래스) 를 따로 만들고, 
	 * 웨이트리스가 반복을 추상화한 이터레이터를 사용해 메뉴들의 구조에 상관없이 
	 * 식당 메뉴들을 주문자에게 알려줄 수 있다. 
	 */
	public static void printMenu() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		
		// Hiding implementation
		System.out.println("USING FOR EACH");
		for (MenuItem menuItem : breakfastItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
		for (MenuItem menuItem : lunchItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
		
		/*
 
		// Exposing implementation
		System.out.println("USING FOR LOOPS");
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}

		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
		
		*/
	}
}
