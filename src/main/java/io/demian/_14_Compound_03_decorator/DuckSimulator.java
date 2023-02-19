package io.demian._14_Compound_03_decorator;

import io.demian._14_Compound_03_decorator.Adapter.GooseAdapter;
import io.demian._14_Compound_03_decorator.Animal.DuckCall;
import io.demian._14_Compound_03_decorator.Animal.Goose;
import io.demian._14_Compound_03_decorator.Animal.MallardDuck;
import io.demian._14_Compound_03_decorator.Animal.Quackable;
import io.demian._14_Compound_03_decorator.Animal.RedheadDuck;
import io.demian._14_Compound_03_decorator.Animal.RubberDuck;
import io.demian._14_Compound_03_decorator.Decorator.QuackCounter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Decorator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
