package com.constructor;

public class Constructor_Method {

	// non-parameter or default
	public Constructor_Method() {

		System.out.println("am default constructor");
	}

	// parameter
	public Constructor_Method(String name) {
		this();
		System.out.println(name);
	}

	public Constructor_Method(int age) {
		this("Ishu");
		System.out.println(age);

	}

	public Constructor_Method(float salary) {
		this(23);
		System.out.println(salary);

	}

	public static void main(String[] args) throws Throwable {

		Constructor_Method c = new Constructor_Method(12.5F);

		c.finalize();
	}
}
