package com.collection;

import java.util.LinkedList;
import java.util.List;

public class List_Type {
	public static void main(String[] args) {

		List<Object> a = new LinkedList<Object>();
		List<Object> s = new LinkedList<Object>();

		a.add(12);
		a.add("raju");
		a.add('M');
		a.add(12.6F);
		a.add(12);

		System.out.println(a);

		int size = a.size();
		System.out.println("size: " + size);

		Object object = a.get(4);
		System.out.println("object :" + object);

		a.set(4, "ramu");
		System.out.println("Set : " + a);

		a.remove(4);
		System.out.println("remove: " + a);

		int indexOf = a.indexOf("raju");
		System.out.println("indexOf :" + indexOf);

		boolean contains = a.contains("raju");
		System.out.println("contains :" + contains);

		s.add(45);
		s.add("ishu");
		s.add(13.5F);
		System.out.println("another list :" + s);
		
		a.addAll(s);
		System.out.println("addall: "+a);
		
	//	a.retainAll(s);
	//	System.out.println("retainall: "+a);
		
		 a.removeAll(s);
		System.out.println("removeall :"+a);

		a.clear();
		System.out.println(a);
	}
}
