package com.abstract1;

public class Class_B extends Class_A {
	@Override
	public void password() {

		System.out.println("2345");
	}

	@Override
	void ifsc() {

		System.out.println("is123456789");
	}

	public static void main(String[] args) {

		Class_B b = new Class_B();
		b.ifsc();
		b.location();
		b.bank();
		b.password();
	}

}
