package com.collection;

import java.util.LinkedList;
import java.util.List;

public class List_Type {
	public static void main(String[] args) {

		List<Object> s = new LinkedList<Object>();
		List<Object> a = new LinkedList<Object>();

		s.add("Name");
		s.add(23);
		s.add('A');
		s.add(12.3F);

		System.out.println("List : " + s);

		int size = s.size();
		System.out.println("size : " + size);

		Object object = s.get(2);
		System.out.println("object : " + object);

		s.set(2, "Raju");
		System.out.println("Set : " + s);

		Object remove = s.remove(3);
		System.out.println("remove : " + remove);
		System.out.println(s);

		int indexOf = s.indexOf(23);
		System.out.println("indexOf :" + indexOf);

		boolean contains = s.contains("Raju");
		System.out.println("contains : " + contains);

		a.add("ramu");
		a.add(25);
		a.add(56.3D);

		System.out.println(a);

		s.addAll(a);
		System.out.println("list : " + s);

		
		  s.removeAll(a); 
		  System.out.println("remove all : "+s);
		 

		/*s.retainAll(a);
		System.out.println("Retain value : " + s);*/

		s.clear();
		System.out.println(s);

	}
}
