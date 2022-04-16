package com.static1;

public class Variable {

	static int a;
	int b;

	private void online() {
		int a=56;
		System.out.println("local variable : " + a);
	}

	public static void main(String[] args) {

		System.out.println("static variable: " + a);
		Variable v = new Variable();
		v.online();

		System.out.println("class variable: " + v.b);
	}

}
