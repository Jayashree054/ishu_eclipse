package com.abstract1;

public class Class_B extends Class_A {

	@Override
	void ifsc() {
		System.out.println("5432166789");
	}

	@Override
	void password() {

		System.out.println("6789");
	}
	
	public static void main(String[] args) {
		Class_B c = new Class_B();
		c.bank();
		c.ifsc();
		c.password();
	}

}
