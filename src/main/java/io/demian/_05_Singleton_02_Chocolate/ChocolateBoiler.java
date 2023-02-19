package io.demian._05_Singleton_02_Chocolate;
 

/*
 * 고전적인 싱글톤 패턴으로 구현된 초콜릿보일러 클래스
 */
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
  
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	/*
	 * 이 객체를 다중 스레드에서 사용하면 객체가 싱글톤으로 만들어지지 않을 가능성이 존재한다.
	*/
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}
	
	/*
	 * 제어자 오른쪽에 syncronized 를 써서 다중스레드 환경에서 생기는 문제를 해결할 수 있지만
	 * 성능에 문제가 생긴다. 성능에 민감한 애플리케이션에서는 이 방법을 사용할 수 없다.
	 */
//	public static synchronized ChocolateBoiler getInstance() {
//		if (uniqueInstance == null) {
//			System.out.println("Creating unique instance of Chocolate Boiler");
//			uniqueInstance = new ChocolateBoiler();
//		}
//		System.out.println("Returning instance of Chocolate Boiler");
//		return uniqueInstance;
//	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
