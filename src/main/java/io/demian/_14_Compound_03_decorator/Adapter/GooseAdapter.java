package io.demian._14_Compound_03_decorator.Adapter;

import io.demian._14_Compound_03_decorator.Animal.Goose;
import io.demian._14_Compound_03_decorator.Animal.Quackable;

/*
 * 오리를 타겟으로
 * 어댑티를 거위로 하는 어댑터
 */
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
