package io.demian._01_Strategy.Context;

import io.demian._01_Strategy.FlyStrategy.FlyWithWings;
import io.demian._01_Strategy.QuackStrategy.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
