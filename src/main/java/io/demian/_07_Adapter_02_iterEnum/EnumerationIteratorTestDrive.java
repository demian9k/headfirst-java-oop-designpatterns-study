package io.demian._07_Adapter_02_iterEnum;

import java.util.*;
// enum을 iterator 처럼 사용
// target 구현체 -> iterator 
// adaptee -> Enumeration
public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
		Vector<String> v = new Vector<String>(Arrays.asList(args));
		Iterator<?> iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
