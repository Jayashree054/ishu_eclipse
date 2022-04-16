package com.scanner;

import java.util.LinkedList;
import java.util.List;

public class List_Type {
	public static void main(String[] args) {

		List<Object> s = new LinkedList<Object>();
		List<Object> a = new LinkedList<Object>();
		s.add(12);
		s.add("raju");
		s.add('M');
		s.add(12.3F);

		System.out.println("List : " + s);

		int size = s.size(); // length
		System.out.println("size : " + size);

		Object object = s.get(1);
		System.out.println("object : " + object);

		Object set = s.set(3, "ajay");

		System.out.println(s);

		Object remove = s.remove(2);
		System.out.println("remove : " + remove);

		System.out.println(s);

		int index = s.indexOf("raju");
		System.out.println("index : " + index);

		boolean contains = s.contains("raju");
		System.out.println("contains : " + contains);

		a.add(34);
		a.add("ramu");
		a.add(14);

		System.out.println("another list : " + a);

		s.addAll(a);
		System.out.println(s);

		/*
		 * s.retainAll(a); System.out.println(s);
		 */

		s.removeAll(a);
		System.out.println(s);
		s.clear();
		System.out.println(s);

	}

}
