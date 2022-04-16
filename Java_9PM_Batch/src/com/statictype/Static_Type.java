package com.statictype;

public class Static_Type {

	static int a = 10; // static variable

	static {

		System.out.println("am static block");
	}

	private static void online() { // static method
		System.out.println("am static method");

	}

	public static void main(String[] args) {

		online();
		System.out.println(a);

	}

}
