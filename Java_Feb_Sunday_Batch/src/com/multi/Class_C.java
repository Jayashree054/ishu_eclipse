package com.multi;

public class Class_C extends Class_B {
	public void name2() {
		System.out.println("ajay");
	}

	public void subject2() {
		System.out.println("social");
	}

	public void grade2() {
		System.out.println('C');
	}

	public static void main(String[] args) {
		Class_C c = new Class_C();
		System.out.println("********************************");
		c.name();
		c.grade();
		c.subject();
		System.out.println("********************************");
		c.name1();
		c.grade1();
		c.subject1();
		System.out.println("********************************");
		c.name2();
		c.subject2();
		c.grade2();
	}
}
