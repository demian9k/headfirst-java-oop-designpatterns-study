package io.demian._05_Singleton_01_Classic;

// NOTE: This is not thread safe!


/*
 * 
 * 객체 중 유일하게 존재해야만 되는 객체가 있다
 * 스레드 풀, 캐시, 대화상자(Dialog), 사용자 설정(Config), 레지스트리 설정을 처리하는 객체, 
 * 로그 기록용 객체, 장치 드라이버 등이다.
 * 
 * 이런 객체들은 인스턴스를 2개 이상 만들면 프로그램이 비정상적으로 움직이거나 불필요한 자원을 소모하게 된다.
 * 
 * 이런 객체들은 싱글톤으로 만들어 사용한다.
 * 
 * static class를 만들어서 사용할 수 있지만  초기화 순서와 고나련된 복잡한 버그가 생길 가능성이 있다.
 * 
 * 전역 변수의 사용은 네임스페이스를 지저분하게 만든다.
 * 
 * 또한 생성자가 private 이기 때문에 서브클래스를 만들지 못한다. 
 * 만약 서브클래스를 만들어야 한다면, 객체가 싱글톤으로 생성되어야 하는지 다시 고려해보는 것이 좋다.
 */
public class Singleton {
	private static Singleton uniqueInstance;
 
	private Singleton() {}  //생성자를 private 로 만들어 외부에서 new 를 통해 생성하지 못하게 한다.
 
	
	/*
	 * 이 메서드로 유일한 객체를 얻는다. 
	 */
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton(); //게으론 인스턴스화 lazy instantiation
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
}
