package io.demian._01_Strategy;

import io.demian._01_Strategy.Context.Duck;
import io.demian._01_Strategy.Context.MallardDuck;
import io.demian._01_Strategy.Context.ModelDuck;
import io.demian._01_Strategy.FlyStrategy.FlyRocketPowered;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
