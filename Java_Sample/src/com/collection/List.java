package com.collection;

import java.util.LinkedList;

public class List {
	public static void main(String[] args) {

		LinkedList<Object> l = new LinkedList<Object>();
		LinkedList<Object> s = new LinkedList<Object>();

		l.add("Name");
		l.add(23);
		l.add(3.8F);
		System.out.println(l);

		int size = l.size();
		System.out.println(size);

		Object object = l.get(2);
		System.out.println(object);

		l.set(1, 45);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		int indexOf = l.indexOf("Name");
		System.out.println(indexOf);
		
		boolean contains = l.contains(45);
		System.out.println(contains);
		s.add("ishu");
		s.add(34);
		System.out.println(s);
		
		l.addAll(s);
		System.out.println(l);
		
		l.retainAll(s);
		System.out.println(l);
		
		l.removeAll(l);
		System.out.println(l);
	
	}	

}
