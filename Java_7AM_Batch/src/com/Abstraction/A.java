package com.Abstraction;

public class A extends Partial_Abstract {
	@Override
	void acc_Details() {
		// TODO Auto-generated method stub
		System.out.println("987654321345");
	}

	@Override
	void hike() {
		// TODO Auto-generated method stub
		System.out.println("25%");
	}
	@Override
	void age() {
		// TODO Auto-generated method stub
	System.out.println("55");	
	}

	public static void main(String[] args) {
	A partial = new A();
	partial.emp_Name();
	partial.salary();
	partial.acc_Details();
	partial.hike();
	partial.age();
}

}
