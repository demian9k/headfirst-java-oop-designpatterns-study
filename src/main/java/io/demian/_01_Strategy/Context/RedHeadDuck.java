package io.demian._01_Strategy.Context;

import io.demian._01_Strategy.FlyStrategy.FlyWithWings;
import io.demian._01_Strategy.QuackStrategy.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
