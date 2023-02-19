package io.demian._02_Observer.Subject;

import io.demian._02_Observer.Observer.Observer;


/*
 * 주제 객체 인터페이스 
 * 일대다 관계에서 다 쪽에 해당하며 옵저버에 등록, 해지, 알림 메서드를 정의한다.
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
