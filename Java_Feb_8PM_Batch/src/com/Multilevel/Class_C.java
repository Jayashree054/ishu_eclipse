package com.Multilevel;

public class Class_C extends Class_B {

	public void name2() {

		System.out.println("ajay");
	}

	public void grade2() {

		System.out.println('C');
	}

	public void subject2() {

		System.out.println("social");
	}

	public static void main(String[] args) {
		Class_C b = new Class_C();

		System.out.println("**********************");
		b.name();
		b.subject();
		b.grade();
		System.out.println("**********************");
		b.name1();
		b.grade1();
		b.subject1();
		System.out.println("**********************");
		b.name2();
		b.grade2();
		b.subject2();
	}
}
