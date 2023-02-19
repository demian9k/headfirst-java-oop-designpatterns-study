package io.demian._03z_Decorator_Exp.Decorator;

import io.demian._03z_Decorator_Exp.Component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}
