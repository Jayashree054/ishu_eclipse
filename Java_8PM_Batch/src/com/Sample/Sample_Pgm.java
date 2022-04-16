package com.Sample;

public final class Sample_Pgm {

	public final void company() { // sign part

		System.out.println("Greens"); // implements

	}

	public void logo() { // sign part

		
		System.out.print("coffee seed"); // implements
		
	}

	protected void program() { // sign part

		System.out.print("java"); // implements

	}

	public void version() { // sign part

		System.out.println(1.8); // implements

	}

	public static void main(String[] args) { // main method sign part

		Sample_Pgm s = new Sample_Pgm(); // object syntax
		
		s.logo();
		s.version();
		s.company();
		s.program();
		
	}

}
