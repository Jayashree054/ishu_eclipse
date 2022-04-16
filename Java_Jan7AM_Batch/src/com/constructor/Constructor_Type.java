package com.constructor;

public class Constructor_Type {
	// non parameter

	public Constructor_Type() {

		System.out.println("am default constructor");

	}
	// parameter
	public Constructor_Type(String name) {

		this(); // current class ref

		System.out.println(name);

	}
	public Constructor_Type(int age) {

		this("ishu");

		System.out.println(age);

	}
	public static void main(String[] args) throws Throwable {
		Constructor_Type c = new Constructor_Type(23);

		c.finalize();

	}

}
