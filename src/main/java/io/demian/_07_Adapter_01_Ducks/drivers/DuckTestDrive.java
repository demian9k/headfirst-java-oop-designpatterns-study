package io.demian._07_Adapter_01_Ducks.drivers;

import io.demian._07_Adapter_01_Ducks.Duck;
import io.demian._07_Adapter_01_Ducks.MallardDuck;
import io.demian._07_Adapter_01_Ducks.WildTurkey;
import io.demian._07_Adapter_01_Ducks.adapters.TurkeyAdapter;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		
		//어댑터를 통해 turkey 를 duck 으로 사용
		//겉모습은 duck 이지만 내용은 turkey
		//target -> duck
		//adaptee -> turkey
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
