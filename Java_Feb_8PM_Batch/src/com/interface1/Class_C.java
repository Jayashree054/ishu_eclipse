package com.interface1;

public class Class_C implements Class_A, Class_B {

	@Override
	public void password() {
		System.out.println("2345");
	}

	@Override
	public void ifsc() {
		System.out.println("123456788");
	
	}

	@Override
	public void bank() {
		System.out.println("sbi");
	}

	@Override
	public void location() {
		System.out.println("chennai");
	}

	public static void main(String[] args) {
		Class_C c = new Class_C();
		c.bank();
		c.location();
		c.password();
		c.ifsc();

	}
}
