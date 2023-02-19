package io.demian._14_Compound_02_adapter.Animal;

public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
