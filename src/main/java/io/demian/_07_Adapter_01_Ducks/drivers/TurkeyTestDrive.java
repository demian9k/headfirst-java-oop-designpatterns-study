package io.demian._07_Adapter_01_Ducks.drivers;

import io.demian._07_Adapter_01_Ducks.MallardDuck;
import io.demian._07_Adapter_01_Ducks.Turkey;
import io.demian._07_Adapter_01_Ducks.adapters.DuckAdapter;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
