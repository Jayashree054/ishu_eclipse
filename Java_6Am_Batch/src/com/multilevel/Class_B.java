package com.multilevel;

public class Class_B extends Class_C {

	private void overal() {

		System.out.println("overall");
	}

	public static void main(String[] args) {

		Class_B b = new Class_B();
		System.out.println("*******************");
		b.overal();
		b.subject();
		b.name();
		b.grade();
		System.out.println("*******************");
		b.grade1();
		b.name1();
		b.subject1();

	}
}
