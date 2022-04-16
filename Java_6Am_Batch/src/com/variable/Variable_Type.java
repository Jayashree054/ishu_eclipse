package com.variable;

public class Variable_Type {

	static int a = 20; // static variable
	int b = 30; // class variable

	private void online() {
		int a = 0; // local variable
		System.out.println("local variable : " + a);
	}

	public static void main(String[] args) {

		System.out.println("static variable: " + a);
		Variable_Type v = new Variable_Type();
		v.online();
		System.out.println("class variable : " + v.b);
	}

}
