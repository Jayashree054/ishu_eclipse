package com.inherit;

public class Class_B extends Class_A {

	private void overall() {
		System.out.println("overall");
	}

	public static void main(String[] args) {

		Class_B b = new Class_B();
		b.overall();
		b.name();
		b.age();
		b.salary();

	}

}
