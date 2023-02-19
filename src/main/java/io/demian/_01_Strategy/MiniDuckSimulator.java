package io.demian._01_Strategy;

import io.demian._01_Strategy.Context.DecoyDuck;
import io.demian._01_Strategy.Context.Duck;
import io.demian._01_Strategy.Context.MallardDuck;
import io.demian._01_Strategy.Context.ModelDuck;
import io.demian._01_Strategy.Context.RubberDuck;
import io.demian._01_Strategy.FlyStrategy.FlyRocketPowered;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		Duck	 model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
