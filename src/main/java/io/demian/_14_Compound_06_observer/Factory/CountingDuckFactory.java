package io.demian._14_Compound_06_observer.Factory;

import io.demian._14_Compound_06_observer.Animal.DuckCall;
import io.demian._14_Compound_06_observer.Animal.MallardDuck;
import io.demian._14_Compound_06_observer.Animal.Quackable;
import io.demian._14_Compound_06_observer.Animal.RedheadDuck;
import io.demian._14_Compound_06_observer.Animal.RubberDuck;
import io.demian._14_Compound_06_observer.Decorator.QuackCounter;

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
