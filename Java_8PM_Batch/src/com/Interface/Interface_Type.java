package com.Interface;

public class Interface_Type implements Class_A, Class_B {

	@Override
	public void name() {

		System.out.println("ishu");
	}

	@Override
	public void acc_No() {

		System.out.println("34567899");
	}

	@Override
	public void bank() {
		// TODO Auto-generated method stub
		System.out.println("sbi");
	}

	@Override
	public void ifsc() {
		// TODO Auto-generated method stub
		System.out.println("34577");
	}

	public static void main(String[] args) {
		Interface_Type i = new Interface_Type();
		i.acc_No();
		i.bank();
		i.ifsc();
		i.name();
		
		
		
	}

}
