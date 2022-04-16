package com.single;

public class Class_A  extends Single_Inherit{

	private void overall() {

		System.out.println("overall");
	}

	public static void main(String[] args) {

		Class_A a = new Class_A();
		
		a.overall();
		a.company();
		a.logo();
		a.version();
		
		
	}

}
