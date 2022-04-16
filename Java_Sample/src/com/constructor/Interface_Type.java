package com.constructor;

public class Interface_Type implements Type1, Typ2 {

	@Override
	public void location() {
	
		System.out.println("chennai");
	}

	@Override
	public void pincode() {
		
		System.out.println("602001");
	}

	@Override
	public void bank() {
		
		System.out.println("abi");
	}

	@Override
	public void ifsc() {
		
		System.out.println("34567899");
	}

	
	
	public static void main(String[] args) {
		Interface_Type i = new Interface_Type();
		i.bank();
		i.ifsc();
		i.location();
		i.pincode();
	}
	
	
}
