package com.collection;

import java.util.LinkedList;
import java.util.List;

public class List_Type {

	public static void main(String[] args) {

		List<Object> a = new LinkedList<Object>();
		List<Object> h = new LinkedList<Object>();
		a.add(12);
		a.add("Ishu");
		a.add('F');
		a.add(12.5F);
		System.out.println(a);

		int size = a.size(); // length
		System.out.println("Size : " + size);

		Object object = a.get(1);
		System.out.println("object : " + object);

		a.set(2, "raju"); // replace
		System.out.println("set: " + a);

		Object remove = a.remove(3);
		System.out.println("remove : " + remove);

		System.out.println(a);

		int indexOf = a.indexOf("Ishu");
		System.out.println("indexOf : " + indexOf);

		boolean contains = a.contains("Raju");
		System.out.println("contains : " + contains);

		h.add("ramu");
		h.add(24);
		h.add(23.4F);
		System.out.println("another list : " + h);
		
		a.addAll(h);
		
		System.out.println("Addall List : " + a);

		a.retainAll(h);
		System.out.println("Retainall : "+a);
	
		a.removeAll(h);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
		
	}
}
