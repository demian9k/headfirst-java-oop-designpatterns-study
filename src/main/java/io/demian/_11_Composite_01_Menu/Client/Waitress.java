package io.demian._11_Composite_01_Menu.Client;

import io.demian._11_Composite_01_Menu.Component.MenuComponent;

public class Waitress {
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
}
