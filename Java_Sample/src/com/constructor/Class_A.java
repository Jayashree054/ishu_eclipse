package com.constructor;

public class Class_A extends Class_B {

	@Override
	void password() {
		System.out.println("5643");
	}

	@Override
	void acc_No() {
		System.out.println("9876543218");

	}

	
	public static void main(String[] args) {
		
		Class_A a = new Class_A();
		a.acc_No();
		a.password();
		a.bank();
		a.ifsc();
		
		
	}
	
}
