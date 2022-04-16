package com.abstract1;

public class Class_B extends Class_A {

	@Override
	public void password() {
		System.out.println(2345);
	}

	@Override
	public void acc() {

		System.out.println("12345678909");
	}

	public static void main(String[] args) {
		Class_B b = new Class_B();

		b.acc();
		b.bank();
		b.location();
		b.password();
	}

}
