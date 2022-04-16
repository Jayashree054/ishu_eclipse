package com.array;

public class Memory {

	public static void main(String[] args) {

		System.out.println("************immutable************************");

		String s = "Greens";

		System.out.println(System.identityHashCode(s));

		String s1 = "Greens";

		System.out.println(System.identityHashCode(s1));

		s = s + s1;
		System.out.println("Concadinate: " + System.identityHashCode(s));

		System.out.println("********************mutable************************");

		StringBuffer b = new StringBuffer("Greens");

		System.out.println(System.identityHashCode(b));

		StringBuffer b1 = new StringBuffer("Greens");

		System.out.println(System.identityHashCode(b1));

		StringBuffer b2 = new StringBuffer(b = b.append(b1));

		System.out.println("append: " + System.identityHashCode(b2));

	}

}
