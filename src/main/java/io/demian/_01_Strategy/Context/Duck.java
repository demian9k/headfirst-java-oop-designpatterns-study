package io.demian._01_Strategy.Context;

import io.demian._01_Strategy.FlyStrategy.FlyBehavior;
import io.demian._01_Strategy.QuackStrategy.QuackBehavior;

public abstract class Duck {
	
	/*
	 * 
	 * 바뀌는 부분은 캡슐화한다.
	 * 
	 * Concrete Class 가 아니라 Interface에 맞춰서 프로그래밍한다.
	 * 오리마다 달라지는 부분인 날기와 꽥꽥거리는 기능을 인터페이스로 만든다.
	 * 
	 * 상속(enherit) 보다 구성(composite) 을 활용한다.
	 * 
	 */
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	

	public Duck() {
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

	abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
