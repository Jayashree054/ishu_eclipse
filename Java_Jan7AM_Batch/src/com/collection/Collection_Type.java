package com.collection;

import java.util.LinkedList;
import java.util.List;

public class Collection_Type {

	public static void main(String[] args) {

		List<Object> s = new LinkedList<Object>();
		List<Object> v = new LinkedList<Object>();

		s.add(12);
		s.add("raju");
		s.add(12);
		s.add('M');
		s.add(12.3F);

		System.out.println(s);

		int size = s.size();
		System.out.println("size : " + size);

		Object object = s.get(1);
		System.out.println("object : " + object);

		s.set(2, "Ishu");
		System.out.println("set: " + s);

		s.remove(4);
		System.out.println("remove :" + s);

		int indexOf = s.indexOf('M');
		System.out.println("indexOf :" + indexOf);

		boolean contains = s.contains("raju");
		System.out.println("contains :" + contains);

		v.add(14);
		v.add("ramu");
		v.add(56);
		System.out.println("another list :" + v);

		s.addAll(v);
		System.out.println("addall: " + s);

		 s.retainAll(v);
		 System.out.println(s);

//		s.removeAll(v);
	//	System.out.println("removeall : " + s);

		s.clear();
		System.out.println("clear: " + s);
	}

}