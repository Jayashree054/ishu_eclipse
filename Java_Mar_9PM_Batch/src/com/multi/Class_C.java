package com.multi;

public class Class_C extends Class_B {

	public void subject2() {

		System.out.println("social");
	}

	public void name2() {

		System.out.println("ramu");
	}

	public static void main(String[] args) {
		Class_C c = new Class_C();
		c.name();
		c.subject();
		System.out.println("*****************");
		c.name1();
		c.subject1();
		System.out.println("*****************");
		c.name2();
		c.subject2();
	}

}
