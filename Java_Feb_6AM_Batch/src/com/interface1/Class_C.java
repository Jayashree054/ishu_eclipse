package com.interface1;

public class Class_C implements Class_A, Class_B {

	
	@Override
	public void password() {
		System.out.println("2345");
	}

	@Override
	public void acc() {
		System.out.println("1234567899");
	}

	@Override
	public void bank() {
		System.out.println("sbi");
	}

	@Override
	public void ifsc() {
		System.out.println("ifsc2334555");
	}

	public static void main(String[] args) {
		
		Class_C c = new Class_C();
		c.acc();
		c.bank();
		c.ifsc();
		c.password();

	}
}
