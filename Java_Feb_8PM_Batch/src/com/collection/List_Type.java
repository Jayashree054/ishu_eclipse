package com.collection;

import java.util.LinkedList;
import java.util.List;

public class List_Type {

	public static void main(String[] args) {

		List<Object> a = new LinkedList<Object>();
		List<Object> b = new LinkedList<Object>();

		a.add("raju");
		a.add(23);
		a.add(12.3F);
		a.add('M');
		a.add(23);

		System.out.println("List: " + a);

		int size = a.size();
		System.out.println("size : " + size);

		Object object = a.get(2);
		System.out.println("object: " + object);

		a.set(4, "ishu");
		System.out.println("replace : " + a);

		a.remove(2);
		System.out.println("remove: " + a);

		int indexOf = a.indexOf(23);
		System.out.println("indexOf: " + indexOf);

		boolean contains = a.contains("ishu");
		System.out.println("contains : " + contains);

		b.add("ajay");
		b.add(16);
		b.add(56.6F);

		System.out.println("another list: " + b);

		a.addAll(b);
		System.out.println(a);

		// a.retainAll(b);
		// System.out.println("retainall: " + a);

		a.removeAll(b);
		System.out.println("removeall: " + a);
		
		a.clear();
		System.out.println(a);
		

	}

}
