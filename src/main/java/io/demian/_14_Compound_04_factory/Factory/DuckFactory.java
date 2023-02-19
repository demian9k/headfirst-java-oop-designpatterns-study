package io.demian._14_Compound_04_factory.Factory;

import io.demian._14_Compound_04_factory.Animal.DuckCall;
import io.demian._14_Compound_04_factory.Animal.MallardDuck;
import io.demian._14_Compound_04_factory.Animal.Quackable;
import io.demian._14_Compound_04_factory.Animal.RedheadDuck;
import io.demian._14_Compound_04_factory.Animal.RubberDuck;
/*
 * 오리를 생성하는 팩토리
 */
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
