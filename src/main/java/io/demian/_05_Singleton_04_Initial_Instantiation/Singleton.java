package io.demian._05_Singleton_04_Initial_Instantiation;

public class Singleton {
	
	/*
	 * 멀티스레드에서 싱글톤을 사용하는 두번째 방법으로 클래스 초기화시 처음부터 초기화를 하는 방법이 있다.
	 * 이 방법은 만약 이 객체를 사용하지 않을 때 자원을 낭비하는 단점이 있다.
	 */
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
