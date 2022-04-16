package com.variable;

public class Variable_Types {

	static int a=34; // static variable

	int b; // class variable

	private void vari() {

		
		System.out.println("local variable :" + a);
	}

	public static void main(String[] args) {

		System.out.println("static variable : " + a);

		Variable_Types v = new Variable_Types();

		v.vari();

		System.out.println("Class variable :" + v.b);
	}

	/*
	 * static int a; // static variable
	 * 
	 * int b; // class variable
	 * 
	 * public void local() { // local variable int a = 100;
	 * System.out.println("Local Varibale : " + a); }
	 * 
	 * public static void main(String[] args) {
	 * System.out.println("Static variable: " + a);
	 * 
	 * Variable_Types v = new Variable_Types();
	 * 
	 * v.local(); System.out.println("Class Variable: " + v.b);
	 * 
	 * }
	 */

}
