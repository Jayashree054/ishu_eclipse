package com.collection;

public class Memory_Type {
	public static void main(String[] args) {

		System.out.println("*******************Immutable******************");

		String s = "Greens";
		System.out.println(System.identityHashCode(s));

		String s1 = "Greens";
		System.out.println(System.identityHashCode(s1));
		
		s= s+s1;
		System.out.println(System.identityHashCode(s));
		
		System.out.println("*******************Mutable*************");

		StringBuffer b = new StringBuffer("Greens");
		System.out.println(System.identityHashCode(b));

		StringBuffer b1 = new StringBuffer("Greens");
		System.out.println(System.identityHashCode(b1));

		StringBuffer b2 = new StringBuffer(b.append(b1));
		System.out.println(System.identityHashCode(b2));

	}

}
