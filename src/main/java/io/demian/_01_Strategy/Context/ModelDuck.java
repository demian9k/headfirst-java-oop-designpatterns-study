package io.demian._01_Strategy.Context;

import io.demian._01_Strategy.FlyStrategy.FlyNoWay;
import io.demian._01_Strategy.QuackStrategy.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
