package com.colllection;

import java.util.LinkedList;
import java.util.List;

public class List_Type {
	public static void main(String[] args) {

		List<Object> a = new LinkedList<Object>();
		List<Object> s = new LinkedList<Object>();

		a.add("ishu");
		a.add(45);
		a.add(12.4F);
		a.add('F');
		a.add(45);

		System.out.println(a);

		int size = a.size();
		System.out.println("size:" + size);

		Object object = a.get(2);
		System.out.println("object :" + object);

		a.set(2, "raju"); // replace
		System.out.println("Set: " + a);

		a.remove(3);
		System.out.println("remove :" + a);

		int indexOf = a.indexOf("raju");
		System.out.println("indexOf :" + indexOf);

		boolean contains = a.contains(45);
		System.out.println("contains :" + contains);

		s.add(67);
		s.add("ajay");
		s.add('M');

		System.out.println("anotherlist :" + s);

		a.addAll(s);
		System.out.println("List Added: " + a);

		a.retainAll(s);
		System.out.println("retainall: " + a);

		a.removeAll(s);
		System.out.println("removeall:" + a);

		a.clear();
		System.out.println("clear:" + a);
	}
}
