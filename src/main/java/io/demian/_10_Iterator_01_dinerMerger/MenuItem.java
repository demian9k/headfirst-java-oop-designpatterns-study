package io.demian._10_Iterator_01_dinerMerger;



/*
 * 메뉴 아이템,
 * 팬케이크하우스와 식당에서 판매하는 음식들을 추상화한 클래스
 */
public class MenuItem {
	
	String name;
	String description;
	boolean vegetarian;
	double price;
 
	public MenuItem(String name, 
	                String description, 
	                boolean vegetarian, 
	                double price) 
	{
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	public String toString() {
		return (name + ", $" + price + "\n   " + description);
	}
}
