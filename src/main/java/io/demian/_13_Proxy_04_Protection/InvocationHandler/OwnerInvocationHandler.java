package io.demian._13_Proxy_04_Protection.InvocationHandler;
 
import java.lang.reflect.*;

import io.demian._13_Proxy_04_Protection.Subject.PersonBean;


/*
 * 실제 프록시는 자바에 의해 생성되며 subject 인터페이스 전체를 구현한다.
 * 대신 개발자는 자바 리플렉션 API의 InvocationHandler 인터페이스를 구현한 아래와 같은 콘크리트 클래스를 만들어
 * 생성된 Proxy 클래스에서 호출하는 invoke 메서드를 구현해야 한다.
 * 즉 이 클래스는 생성된 프록시 클래스에 응답하는 역할을 담당하는 것이다.
 * 
 * 
 */
public class OwnerInvocationHandler implements InvocationHandler { 
	PersonBean person;
 
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
 
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws IllegalAccessException {
  
		//이 클래스는 스스로가 인물정보에 접근할 때 호출된다.
		//get 메서드와 set 메서드는 호출가능하지만 
		//선호도를 설정하는 setHotOrNotRating 메서드는 호출하면 익셉션이 발생한다.
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
   			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessException();
			} else if (method.getName().startsWith("set")) {
				return method.invoke(person, args);
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}
}
