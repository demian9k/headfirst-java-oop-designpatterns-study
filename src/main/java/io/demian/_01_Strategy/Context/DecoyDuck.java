package io.demian._01_Strategy.Context;

import io.demian._01_Strategy.FlyStrategy.FlyNoWay;
import io.demian._01_Strategy.QuackStrategy.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
