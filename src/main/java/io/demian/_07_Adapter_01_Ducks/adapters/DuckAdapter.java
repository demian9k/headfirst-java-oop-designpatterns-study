package io.demian._07_Adapter_01_Ducks.adapters;
import java.util.Random;

import io.demian._07_Adapter_01_Ducks.Duck;
import io.demian._07_Adapter_01_Ducks.Turkey;

//target ����ü -> turkey
//adaptee -> duck
public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;
 
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
    
	public void gobble() {
		duck.quack();
	}
  
	public void fly() {
		if (rand.nextInt(5)  == 0) {
		     duck.fly();
		}
	}
}
