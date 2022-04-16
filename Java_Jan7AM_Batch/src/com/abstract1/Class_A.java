package com.abstract1;

public class Class_A extends Abstract_Type {

	@Override
	void pin_No() {
		System.out.println("3442");
	}

	@Override
	void acc_No() {
		System.out.println("9876543215");
	}

	public static void main(String[] args) {
		Class_A a = new Class_A();

		a.bank();
		a.ifsc();
		a.acc_No();
		a.pin_No();
	}
}
