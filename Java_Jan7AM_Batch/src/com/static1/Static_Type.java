package com.static1;

public class Static_Type {


	static int a = 10; //static variable
	
	private static void online() { // static method

		System.out.println("am static method");
	}

	static { // static block
		System.out.println("am static block");
	}

	public static void main(String[] args) {
		online();
		
		System.out.println("static variable : "+a);
	}
}
