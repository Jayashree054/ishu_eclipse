``package com.java;

public class Converstion {

	static int i = 20;
	static String s = "67";

	static void method1() {
		System.out.println("string to int");
		int parseInt = Integer.parseInt(s);
		// Integer valueOf = Integer.valueOf(s);
		System.out.println(parseInt);
	}

	static void method2() {
		System.out.println("int to string");
		String string = Integer.toString(i);
		// String valueOf = String.valueOf(i);
		System.out.println(string);

	}

	static void double1() {
		System.out.println("int to double");
		Double valueOf = Double.valueOf(i);
		System.out.println(valueOf);

	}

	public static void main(String[] args) {
		method1();
		method2();
		double1();
	}

}
