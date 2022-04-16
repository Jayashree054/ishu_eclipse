package com.Inhertiance;

public class Single_B extends Single_A {

	private void overall() {

		System.out.println("overall program");

	}

	public static void main(String[] args) {

		Single_B b = new Single_B();

		b.overall();
		b.company();
		b.logo();
		b.program();

	}

}
