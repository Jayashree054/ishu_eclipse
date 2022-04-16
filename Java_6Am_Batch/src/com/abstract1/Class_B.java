package com.abstract1;

public class Class_B extends Class_A {

	@Override
	public void pin() {
		System.out.println("3454");
	}

	@Override
	public void acc() {
		System.out.println("23456789");
	}

	public static void main(String[] args) {
		Class_B b = new Class_B();
		b.acc();
		b.bank();
		b.ifsc();
		b.pin();
	}
}
