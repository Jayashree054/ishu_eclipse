package com.static_key;

public class Sample_Pgm {

	private void offline() {
		// TODO Auto-generated method stub
		System.out.println("method");
	}

	private static void online() {
		// TODO Auto-generated method stub
		System.out.println("static method");
	}

	static {
		System.out.println("block");
	}

	public Sample_Pgm() {
		// TODO Auto-generated constructor stub
		System.out.println("const");
	}

	public static void main(String[] args) {
		online();// static method
		Sample_Pgm s = new Sample_Pgm();// constructor pgm
		s.offline();
	}
}
