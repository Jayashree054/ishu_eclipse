package com.interface1;

public class Class_C implements Class_A, Class_B {

	@Override
	public void pin() {

		System.out.println("2342");
	}

	@Override
	public void acc_No() {
		System.out.println("987654321");
	}

	@Override
	public void bank() {
		System.out.println("sbi");
	}

	@Override
	public void ifsc() {
		System.out.println("ifsc34566");
	}

	public static void main(String[] args) {

		Class_C c = new Class_C();
		c.acc_No();
		c.bank();
		c.ifsc();
		c.pin();

	}

}
