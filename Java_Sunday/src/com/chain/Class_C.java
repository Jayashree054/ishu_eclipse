package com.chain;

public class Class_C extends Class_B {

	public void subject2() {
		System.out.println("social");
	}

	public void name2() {
		System.out.println("ramu");

	}

	public void age2() {
		System.out.println(25);

	}

	public static void main(String[] args) {
		Class_C c = new Class_C();
		System.out.println("************");
		c.name();
		c.age();
		c.subject();
		System.out.println("************");
			c.name1();
		c.age1();
		c.subject1();
		System.out.println("************");
		c.name2();
		c.age2();
		c.subject2();
	}
}
