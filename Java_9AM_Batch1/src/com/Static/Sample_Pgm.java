package com.Static;

public class Sample_Pgm {

	private void online() {
		// TODO Auto-generated method stub
		System.out.println("Noraml method");
	}

	static {
		System.out.println("Static block");
	}

	public Sample_Pgm() {
		// TODO Auto-generated constructor stub
		System.out.println("am Constructor");

	}

	public static void main(String[] args) {

		Sample_Pgm s = new Sample_Pgm();//constructor
		s.online();
	}
}
