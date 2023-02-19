package io.demian._09_TemplateMethod_02_Barista.CaffeineBeverage;


/*
 * 
 * 템플릿 메서드 패턴은 메소드에서 알고리즘의 골격을 정의한다.
 * 
 * 여러 단계 중 일부를 서브클래스에서 구현하며
 * 
 * 이 패턴은 알고리즘의 구조는 그대로 유지하면서 서브클래스에서 특정 단계를 재정의할 수 있다.
 * 
 * 할리우드 원칙을 따라
 * 저수준 구성요소에서는 기능만을 제공하고 어떤 식으로 사용할 지는 
 * 고수준 구성요소(템플릿) 에서 결정하게 된다.
 * 
 * JAVA API 에서는 Comparable 인터페이스의 CompareTo 메서드가 대표적이다. 
 * 
 */
public abstract class CaffeineBeverage {
  
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
 
	abstract void brew();
  
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
  
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
