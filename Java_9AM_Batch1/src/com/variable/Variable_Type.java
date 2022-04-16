package com.variable;

public class Variable_Type {

	static int a; // static variable

	int b; // class variable

	private void local() { // local variable
		int a = 20;
		System.out.println("local variable: " + a);
	}

	public static void main(String[] args) {

		System.out.println("Static variable: " + a);

		// object syntax
		Variable_Type v = new Variable_Type();
		v.local();
		System.out.println("Class variable: " + v.b);


	}

}
