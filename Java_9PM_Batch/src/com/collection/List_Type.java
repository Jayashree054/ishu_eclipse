package com.collection;

import java.util.LinkedList;
import java.util.List;

public class List_Type {
	public static void main(String[] args) {

		List<Object> a = new LinkedList<Object>();
		List<Object> h = new LinkedList<Object>();

		a.add("raju");
		a.add(12);
		a.add(12.3F);
		a.add('M');

		System.out.println(a);

		int size = a.size(); //length
		System.out.println("size : " + size);

		Object object = a.get(2);
		System.out.println("object : " + object);

		a.set(2, "list");//replace
		System.out.println("set : " + a);

		a.remove(2);
		System.out.println("Remove : " + a);

		int indexOf = a.indexOf("raju");
		System.out.println("indexOf : " + indexOf);

		boolean contains = a.contains("Raju");
		System.out.println("contains : " + contains);

		h.add(14);
		h.add("ishu");
		h.add(34.2F);
		System.out.println(h);
		
		a.addAll(h);
		System.out.println("Addall : " + a);
		
		a.retainAll(h);
		System.out.println("retainall : "+a);
		
		a.removeAll(h);
		System.out.println("removeall : "+a);
		
		a.clear();
		System.out.println(a);

		
		
	
	}
}
