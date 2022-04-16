package com.constructor;

public class Constructor_Pgm {

	// non-parameter or default constructor

	public Constructor_Pgm() {
		// TODO Auto-generated constructor stub
		System.out.println("am constructor");
	}

	// parameter constructor
	public Constructor_Pgm(String name, int age) {
		this();
		System.out.println(name);
		System.out.println(age);
	}

	public Constructor_Pgm(int age) {
		this("raju", 23);
		System.out.println(age);
	}

	public Constructor_Pgm(char gender) {
		this(23);
		System.out.println(gender);
	}

	public Constructor_Pgm(float salary) {
		this('F');
		System.out.println(salary);
	}

	public Constructor_Pgm(long pincode) {
		this(12.3F);
		System.out.println(pincode);
	}

	public static void main(String[] args) throws Throwable {
		Constructor_Pgm c = new Constructor_Pgm(65432L);
	}

}
