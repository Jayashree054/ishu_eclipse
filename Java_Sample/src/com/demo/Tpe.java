package com.demo;

public class Tpe {

	public static void main(String[] args) {

		String s = "Greens";

		System.out.println(System.identityHashCode(s));

		String s1 = "Greens";
		System.out.println(System.identityHashCode(s1));
		s = s + s1;
		System.out.println("concadinate");
		System.out.println(System.identityHashCode(s));

		StringBuffer d = new StringBuffer("Greens");
		System.out.println(System.identityHashCode(d));

		StringBuffer d1 = new StringBuffer("Greens");
		System.out.println(System.identityHashCode(d1));

		d = d.append(d1);
		System.out.println(System.identityHashCode(d));

	}

}
