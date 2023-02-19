package io.demian._05_Singleton_05_DoubleCheckingLocking;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
	}
}
