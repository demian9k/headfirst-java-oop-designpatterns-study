package io.demian._07_Adapter_01_Ducks.adapters;

import io.demian._07_Adapter_01_Ducks.Duck;
import io.demian._07_Adapter_01_Ducks.Turkey;

//target -> duck
//adaptee -> turkey
public class TurkeyAdapter implements Duck {
	Turkey turkey;
 
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
