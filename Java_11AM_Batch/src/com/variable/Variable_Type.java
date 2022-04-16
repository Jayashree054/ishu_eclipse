package com.variable;

public class Variable_Type {

	// data type variable name = variable value

	static int a; // static variable

	int b; // class variable

	private void online() {

		int c = 0; // local variable

		System.out.println("local variable: " + c);

	}

	public static void main(String[] args) {

		System.out.println("static variable : " + a); //static

		Variable_Type v = new Variable_Type();

		System.out.println("class variable: " + v.b); // class

		v.online(); //local

	}
}
