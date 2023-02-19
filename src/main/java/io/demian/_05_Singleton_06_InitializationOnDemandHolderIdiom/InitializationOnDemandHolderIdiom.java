package io.demian._05_Singleton_06_InitializationOnDemandHolderIdiom;

/*
 * JVM의 class loader 메커니즘과 
 * class의 load 시점을 이용해 내부 클래스를 생성함으로서 thread 간의 동기화 문제를 해결한다.
 */
public class InitializationOnDemandHolderIdiom {

	private InitializationOnDemandHolderIdiom () {}
	
	private static class Singleton {
		private static final InitializationOnDemandHolderIdiom  instance = new InitializationOnDemandHolderIdiom ();
	}
	
	public static InitializationOnDemandHolderIdiom getInstance () {
		return Singleton.instance;
	}
	
}
