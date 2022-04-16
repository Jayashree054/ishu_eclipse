package com.collection;

import java.util.LinkedList;
import java.util.List;

public class List_Type {

	public static void main(String[] args) {

		List<Object> l = new LinkedList<Object>();
		List<Object> s = new LinkedList<Object>();

		l.add("Raju");
		l.add(23);
		l.add(23.4F);
		l.add('M');
		System.out.println("List Value : " + l);

		int size = l.size();
		System.out.println("Size : " + size);

		Object object = l.get(1);
		System.out.println("object : " + object);
		
		System.out.println(l);
		
		l.set(2, "raju");
		System.out.println("set : "+l);
		
		Object remove = l.remove(2);
		System.out.println("remove : " + remove);

		System.out.println(l);

		int indexOf = l.indexOf('M');
		System.out.println("indexOf : " + indexOf);

		boolean contains = l.contains("Raju");
		System.out.println("contains : " + contains);

		s.add("Ishu");
		s.add(34);
		s.add(56.F);

		System.out.println(s);

		l.addAll(s);
		System.out.println(l);

		l.retainAll(s);
		System.out.println(l);
		
		l.clear();
		System.out.println(l);

		l.removeAll(l);
		System.out.println(l);

	}

}
