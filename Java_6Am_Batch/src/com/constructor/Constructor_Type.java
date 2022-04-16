package com.constructor;

public class Constructor_Type {
	// non parameter
	public Constructor_Type() {
		System.out.println("am default method");

	}

	// parameter
	public Constructor_Type(String name) {
		this();
		System.out.println(name);

	}

	public Constructor_Type(int age) {
		this("raju");
		System.out.println(age);

	}

	public Constructor_Type(char gender) {
		this(23);
		System.out.println(gender);

	}

	public static void main(String[] args) throws Throwable {
		Constructor_Type c = new Constructor_Type('M');
		c.finalize();

	}

}
