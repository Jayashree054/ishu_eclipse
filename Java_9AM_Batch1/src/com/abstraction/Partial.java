package com.abstraction;

public class Partial extends Abstract_Sample {

	
	@Override
	void pin_no() {
		// TODO Auto-generated method stub
		System.out.println("8796");
	}

	@Override
	void bank() {
		// TODO Auto-generated method stub
		System.out.println("iob");
	}
	public static void main(String[] args) {

		Partial p = new Partial();
		p.acc_no();
		p.bank();
		p.online();
		p.pin_no();

	}

}
