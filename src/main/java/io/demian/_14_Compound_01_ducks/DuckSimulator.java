package io.demian._14_Compound_01_ducks;

import io.demian._14_Compound_01_ducks.Animal.DuckCall;
import io.demian._14_Compound_01_ducks.Animal.MallardDuck;
import io.demian._14_Compound_01_ducks.Animal.Quackable;
import io.demian._14_Compound_01_ducks.Animal.RedheadDuck;
import io.demian._14_Compound_01_ducks.Animal.RubberDuck;

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
 
		System.out.println("\nDuck Simulator");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
	}
   
	void simulate(Quackable duck) {
		duck.quack();
	}
}
