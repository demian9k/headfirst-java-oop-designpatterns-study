package io.demian._14_Compound_05_composite.Factory;

import io.demian._14_Compound_05_composite.Animal.DuckCall;
import io.demian._14_Compound_05_composite.Animal.MallardDuck;
import io.demian._14_Compound_05_composite.Animal.Quackable;
import io.demian._14_Compound_05_composite.Animal.RedheadDuck;
import io.demian._14_Compound_05_composite.Animal.RubberDuck;
import io.demian._14_Compound_05_composite.Decorator.QuackCounter;

public class CountingDuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
