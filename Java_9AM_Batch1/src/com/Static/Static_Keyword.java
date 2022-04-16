package com.Static;

public class Static_Keyword {

	// static block
	static {
		System.out.println("Am Static Block");
	}

	// static method

	private static void online() {
		// TODO Auto-generated method stub
		System.out.println("Am Method");
	}

	// static variable

	static int a;
	static int b = 20;
	static int c = a + b;

	private static void offline() {
		int a = 20;
		System.out.println("Am Variable");
		System.out.println(c);

	}

	private void company() {
		// TODO Auto-generated method stub
		System.out.println("normal method");
	}

	public static void main(String[] args) {
		online();
		offline();

	}

}
