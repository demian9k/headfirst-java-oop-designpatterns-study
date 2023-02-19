package io.demian._14_Compound_04_factory.Factory;

import io.demian._14_Compound_04_factory.Animal.DuckCall;
import io.demian._14_Compound_04_factory.Animal.MallardDuck;
import io.demian._14_Compound_04_factory.Animal.Quackable;
import io.demian._14_Compound_04_factory.Animal.RedheadDuck;
import io.demian._14_Compound_04_factory.Animal.RubberDuck;
import io.demian._14_Compound_04_factory.Decorator.QuackCounter;

/*
 * 오리를 세는 데코레이터가 추가된 팩토리 클래스
 */
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
