package com.abstrct1;

public class Class_B extends Class_A {

	@Override
	void pin() {

		System.out.println(2345);
	}
	
	@Override
	void accno() {

		System.out.println("1234567");
	}

	public static void main(String[] args) {
		Class_B b = new Class_B();

		b.accno();
		b.pin();
		b.bank();
		b.location();
	}
}
