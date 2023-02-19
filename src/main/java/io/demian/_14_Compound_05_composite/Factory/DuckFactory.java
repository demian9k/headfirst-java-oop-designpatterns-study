package io.demian._14_Compound_05_composite.Factory;

import io.demian._14_Compound_05_composite.Animal.DuckCall;
import io.demian._14_Compound_05_composite.Animal.MallardDuck;
import io.demian._14_Compound_05_composite.Animal.Quackable;
import io.demian._14_Compound_05_composite.Animal.RedheadDuck;
import io.demian._14_Compound_05_composite.Animal.RubberDuck;

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
