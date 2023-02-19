package io.demian._09_TemplateMethod_01_simpleBarista;

/*
 * 개선되기 전 바리스타 클래스
 */
public class Barista {
 
	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		System.out.println("Making tea...");
		tea.prepareRecipe();
		System.out.println("Making coffee...");
		coffee.prepareRecipe();
	}
}
