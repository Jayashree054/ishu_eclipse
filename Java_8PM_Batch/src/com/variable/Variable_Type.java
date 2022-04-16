package com.variable;

public class Variable_Type {

	// data type variable name= variable value

	static int a; // static variable

	int b; // class variable

	private void offline() {
		int a=0;
		System.out.println("local variable : " + a);
	}

	public static void main(String[] args) {

		System.out.println("static variable: " + a);

		Variable_Type v = new Variable_Type();
		v.offline();
		System.out.println("class variable: " + v.b);

	}

}
