package io.demian._14_Compound_06_observer.Adapter;

import io.demian._14_Compound_06_observer.Animal.Goose;
import io.demian._14_Compound_06_observer.Animal.Quackable;
import io.demian._14_Compound_06_observer.Observer.Observable;
import io.demian._14_Compound_06_observer.Observer.Observer;

public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
 
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
