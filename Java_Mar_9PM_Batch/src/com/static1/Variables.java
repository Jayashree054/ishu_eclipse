package com.static1;

public class Variables {

	static int a; // static variable
	int b;// class variable

	private void online() {
		int a = 30;
		System.out.println("local variable: " + a);

	}

	public static void main(String[] args) {
		System.out.println("static variable: " + a);
		Variables v = new Variables();
		v.online();
		System.out.println("class variable: " + v.b);

	}

}
