package io.demian._14_Compound_06_observer.Observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
