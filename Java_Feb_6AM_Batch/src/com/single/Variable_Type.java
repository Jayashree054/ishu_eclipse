package com.single;

public class Variable_Type {

	static int a;
	int b;

	private void online() {
		int a = 10;

		System.out.println("local variable: " + a);

	}

	public static void main(String[] args) {
		System.out.println("static variable:" + a);

		Variable_Type v = new Variable_Type();

		v.online();
		System.out.println("class variable :" + v.b);

	}

}
