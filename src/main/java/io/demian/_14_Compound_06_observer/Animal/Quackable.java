package io.demian._14_Compound_06_observer.Animal;

import io.demian._14_Compound_06_observer.Observer.QuackObservable;

public interface Quackable extends QuackObservable {
	public void quack();
}
