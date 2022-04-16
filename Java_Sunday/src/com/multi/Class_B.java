package com.multi;

public class Class_B extends Class_A {

	private void overAll() {
		System.out.println("overall");
	}

	public static void main(String[] args) {

		Class_B b = new Class_B();
		b.overAll();
		b.name();
		b.age();
		b.salary();

	}
	
}
