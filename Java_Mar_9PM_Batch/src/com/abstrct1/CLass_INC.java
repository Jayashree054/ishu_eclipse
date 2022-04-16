package com.abstrct1;

public class CLass_INC implements Class_INA, Class_INB {
	@Override
	public void pin() {

		System.out.println(2345);
	}

	@Override
	public void accno() {

		System.out.println("9876543211");
	}

	@Override
	public void bank() {

		System.out.println("abi");
	}

	@Override
	public void location() {

		System.out.println("chennai");
	}

	public static void main(String[] args) {
		CLass_INC c = new CLass_INC();
		c.accno();
		c.bank();
		c.location();
		c.pin();
	}

}
