package io.demian._14_Compound_03_decorator.Decorator;

import io.demian._14_Compound_03_decorator.Animal.Quackable;

/*
 * 오리의 갯수를 세는 데코레이터 클래스
 */
public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter (Quackable duck) {
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
