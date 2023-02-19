package io.demian._14_Compound_04_factory.Factory;

import io.demian._14_Compound_04_factory.Animal.Quackable;

/*
 * 추상팩토리 클래스
 */
public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
