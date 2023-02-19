package io.demian._14_Compound_02_adapter;

import io.demian._14_Compound_02_adapter.Adapter.GooseAdapter;
import io.demian._14_Compound_02_adapter.Animal.DuckCall;
import io.demian._14_Compound_02_adapter.Animal.Goose;
import io.demian._14_Compound_02_adapter.Animal.MallardDuck;
import io.demian._14_Compound_02_adapter.Animal.Quackable;
import io.demian._14_Compound_02_adapter.Animal.RedheadDuck;
import io.demian._14_Compound_02_adapter.Animal.RubberDuck;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		System.out.println("\nDuck Simulator: With Goose Adapter");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
