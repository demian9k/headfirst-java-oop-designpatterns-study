package io.demian._14_Compound_04_factory;

import io.demian._14_Compound_04_factory.Adapter.GooseAdapter;
import io.demian._14_Compound_04_factory.Animal.Goose;
import io.demian._14_Compound_04_factory.Animal.Quackable;
import io.demian._14_Compound_04_factory.Decorator.QuackCounter;
import io.demian._14_Compound_04_factory.Factory.AbstractDuckFactory;
import io.demian._14_Compound_04_factory.Factory.CountingDuckFactory;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
 
		simulator.simulate(duckFactory);
	}
 
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		System.out.println("\nDuck Simulator: With Abstract Factory");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
 
		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuacks() + 
		                   " times");
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
