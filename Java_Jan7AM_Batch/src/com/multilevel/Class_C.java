package com.multilevel;

public class Class_C extends Class_B {

	public void subject2() {
		System.out.println("social");
	}

	public void name2() {
		System.out.println("ishu");
	}

	public void grade2() {
		System.out.println("c");
	}

	public static void main(String[] args) {
		Class_C c = new Class_C();
		System.out.println("****************");
		c.subject();
		c.name();
		c.grade();
		System.out.println("****************");
		c.name1();
		c.grade1();
		c.subject1();
		System.out.println("****************");
		c.grade2();
		c.name2();
		c.subject2();
	}

}
