package io.demian._05_Singleton_03_threadSafe;

public class Singleton {
	private static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	private Singleton() {}
	/*
	 * 다중 스레드 환경에서 유일한 인스턴스를 얻는 방법 첫번재
	 * syncronized 키워드를 사용해 메서드를 동시에 호출하지 못하게 한다.
	 */
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
