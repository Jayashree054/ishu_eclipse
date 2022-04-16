package com.demo;

public class B extends Inherit_Sample {

	private void simple() {
		// TODO Auto-generated method stub
		System.out.println("simple inherit");
	}

	public static void main(String[] args) {
		B ref = new B();
		ref.company();
		ref.logo();
		ref.emp_Id();
		ref.no_Emp();
		ref.simple();
	}

}
