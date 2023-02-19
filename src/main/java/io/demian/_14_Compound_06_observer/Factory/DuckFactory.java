package io.demian._14_Compound_06_observer.Factory;

import io.demian._14_Compound_06_observer.Animal.DuckCall;
import io.demian._14_Compound_06_observer.Animal.MallardDuck;
import io.demian._14_Compound_06_observer.Animal.Quackable;
import io.demian._14_Compound_06_observer.Animal.RedheadDuck;
import io.demian._14_Compound_06_observer.Animal.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
