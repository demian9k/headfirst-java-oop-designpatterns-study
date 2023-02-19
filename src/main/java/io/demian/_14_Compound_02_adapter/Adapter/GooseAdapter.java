package io.demian._14_Compound_02_adapter.Adapter;

import io.demian._14_Compound_02_adapter.Animal.Goose;
import io.demian._14_Compound_02_adapter.Animal.Quackable;

public class GooseAdapter implements Quackable {
	Goose goose;
 
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
 
	public void quack() {
		goose.honk();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
