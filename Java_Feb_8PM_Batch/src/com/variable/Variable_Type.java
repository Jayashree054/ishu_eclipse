package com.variable;

public class Variable_Type {

	static int a=50; // static variable
	int b = 20; // class variable

	private void online() {

		int a = 49; // local variable

		System.out.println("local variable :" + a);

	}
	public static void main(String[] args) {
		System.out.println("am static variable: " + a);

		Variable_Type v = new Variable_Type();

		System.out.println("am local variable: " + v.b);
		v.online();
	}

}
