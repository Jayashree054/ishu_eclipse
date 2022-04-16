package com.collection;

import java.util.LinkedList;
import java.util.List;

public class List_Type {
	public static void main(String[] args) {

		List<Object> s = new LinkedList<Object>();
		List<Object> a = new LinkedList<Object>();

		s.add(12);
		s.add("Ishu");
		s.add('F');
		s.add(45.5F);
		s.add(12);
		s.add("raju");

		System.out.println("Linked list: " + s);

		int size = s.size();
		System.out.println("size:" + size);

		Object object = s.get(2);
		System.out.println("object: " + object);

		s.set(5, 87);
		System.out.println("set: " + s);

		s.remove(5);
		System.out.println("remove: " + s);

		int indexOf = s.indexOf("Ishu");
		System.out.println("indexOf :" + indexOf);

		boolean contains = s.contains("Ishu");
		System.out.println("contains: " + contains);

		a.add(97);
		a.add("ramu");
		a.add('M');
		System.out.println("another list: " + a);

		s.addAll(a);
		System.out.println("addall: " + s);

		// s.retainAll(a);
		// System.out.println("retainlist:" + s);

		s.removeAll(a);
		System.out.println("removeall" + s);

		s.clear();
		System.out.println("clear: " + s);

	}
}
