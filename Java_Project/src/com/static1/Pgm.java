package com.static1;

public class Pgm {
	int a;
	String s;

	
	public static void main(String[] args) {

		Pgm p = new Pgm();
		Pgm s = new Pgm();

		p.online();
		s.online();
	}

	void online() {

		System.out.println(a + " " + s);
	}

}
