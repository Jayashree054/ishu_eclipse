package com.scanner;

public class Static {

	static int a = 10;

	private static void online() {
		System.out.println("am static method");

	}

	static {

		System.out.println("am static block");

	}

	public static void main(String[] args) {

		online();
		System.out.println("static variable : " + a);

	}

}
