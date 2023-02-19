package io.demian._14_Compound_05_composite.Factory;

import io.demian._14_Compound_05_composite.Animal.Quackable;

public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
