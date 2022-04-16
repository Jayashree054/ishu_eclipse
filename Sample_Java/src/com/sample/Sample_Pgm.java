package com.sample;

public class Sample_Pgm {

	private void name() { // sign part

		System.out.println("greens"); // imp part

	}
	public void logo() { // sign part

		System.out.println("coffee"); // imp part

	}
	protected void age() { // sign part

		System.out.println(23); // imp part

	}
	public void version() { // sign part

		System.out.println(1.8F); // imp part

	}

	public static void main(String[] args) { // main method sign part

		Sample_Pgm s = new Sample_Pgm(); //object syntax

		s.name(); //method calling
		s.logo();
		s.version();
		s.age();

	}

}
