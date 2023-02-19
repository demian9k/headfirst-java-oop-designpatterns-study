package io.demian._13_Proxy_04_Protection.InvocationHandler;
 
import java.lang.reflect.*;

import io.demian._13_Proxy_04_Protection.Subject.PersonBean;
 
public class NonOwnerInvocationHandler implements InvocationHandler { 
	PersonBean person;
 
	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
 
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws IllegalAccessException {
		
		//주인이 아는 인물정보에 접근할때는 set 메서드에서 선호도만 설정가능하다.
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
   			} else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(person, args);
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			} 
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}
}
