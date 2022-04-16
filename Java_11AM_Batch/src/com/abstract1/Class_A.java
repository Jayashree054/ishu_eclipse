package com.abstract1;

public class Class_A extends Type_Abstract  {

	@Override
	void ifsc() {
		
		System.out.println("ifsc2345");
		
	}

	@Override
	void password() {
		
		System.out.println("3452");
	}

	
	public static void main(String[] args) {
		Class_A a = new Class_A();
		a.ifsc();
		a.password();
		a.bank();
		
		
	}
}
