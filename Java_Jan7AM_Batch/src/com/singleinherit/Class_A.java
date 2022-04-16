package com.singleinherit;

public class Class_A extends Single_Type {

	private void overall() {
	
		System.out.println("overall");
	}
	
	public static void main(String[] args) { //main method
		Class_A a = new Class_A();
		System.out.println("****************");
		a.overall();
		a.email();
		a.name();
		a.age();
		a.salary();
		
	}
}
