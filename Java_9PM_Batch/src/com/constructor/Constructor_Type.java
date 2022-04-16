package com.constructor;

public class Constructor_Type {

	// non-parameter or default constructor

	public Constructor_Type() {

		System.out.println("raju");

	}

	// parameter constructor

	public Constructor_Type(String name) {

		this();

		System.out.println(name);

	}

	public Constructor_Type(int age) {

		this("Ishu");
		
		System.out.println(age);

	}

	public Constructor_Type(float salary) {

		this(23);
	
		System.out.println(salary);

	}

	public static void main(String[] args) throws Throwable {

		Constructor_Type c = new Constructor_Type(12.3F);

		c.finalize();
		
	}

}
