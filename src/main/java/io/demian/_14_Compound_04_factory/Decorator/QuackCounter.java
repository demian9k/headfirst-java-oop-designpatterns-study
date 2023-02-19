package io.demian._14_Compound_04_factory.Decorator;

import io.demian._14_Compound_04_factory.Animal.Quackable;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
   
	public String toString() {
		return duck.toString();
	}
}
