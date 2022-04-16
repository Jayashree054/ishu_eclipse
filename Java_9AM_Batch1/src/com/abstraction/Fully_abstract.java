package com.abstraction;

public class Fully_abstract implements A, B {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("raju");
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("chennai");
	}

	@Override
	public void pincode() {
		// TODO Auto-generated method stub
		System.out.println("602001");
	}

	@Override
	public void bank() {
		// TODO Auto-generated method stub
		System.out.println("IOB");
	}

	@Override
	public void pin_no() {
		// TODO Auto-generated method stub
		System.out.println("8798");
	}

	@Override
	public void ifsc() {
		// TODO Auto-generated method stub
		System.out.println("uhf4567");
	}

	@Override
	public void acc_no() {
		// TODO Auto-generated method stub
		System.out.println("567890754");
	}

	public static void main(String[] args) {
		Fully_abstract a = new Fully_abstract();
		a.name();
		a.location();
		a.pincode();
		a.bank();
		a.acc_no();
		a.ifsc();
		a.pin_no();

	}

}
