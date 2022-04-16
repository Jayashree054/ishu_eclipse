package com.interface1;

public class ClassC implements ClassB, ClassA {

	@Override
	public void bank() {
		System.out.println("sbi");
	}

	@Override
	public void ifsc() {
		System.out.println("ifsc098765444");
	}

	@Override
	public void pin() {
		System.out.println("8765");
	}

	@Override
	public void acc() {
		System.out.println("5678542");
	}

	public static void main(String[] args) {
		ClassC v = new ClassC();
		v.acc();
		v.bank();
		v.ifsc();
		v.pin();
	}
}
