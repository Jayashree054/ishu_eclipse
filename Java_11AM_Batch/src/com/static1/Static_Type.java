package com.static1;

public class Static_Type {

	// data type variable name = variable value

	static int a = 10; // static variable

	private static void online() {
		
		System.out.println(a);
		
		System.out.println("am static method"); // static method

	}

	static {
		System.out.println("am static block");

	}

	public static void main(String[] args) {

		online();

		
	}

}
