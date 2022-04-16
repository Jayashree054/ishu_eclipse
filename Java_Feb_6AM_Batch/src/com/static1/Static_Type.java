package com.static1;

public class Static_Type {

	static int a = 10;

	private static void online() {
		System.out.println("am static method");

	}

	static {
		System.out.println("am static block");
	}

	public static void main(String[] args) {
		online();
		System.out.println("am static variable:" + a);
	}
}
