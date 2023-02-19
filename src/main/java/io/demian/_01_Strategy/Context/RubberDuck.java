package io.demian._01_Strategy.Context;

import io.demian._01_Strategy.FlyStrategy.FlyNoWay;
import io.demian._01_Strategy.QuackStrategy.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
