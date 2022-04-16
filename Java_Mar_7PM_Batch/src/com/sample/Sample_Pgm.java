package com.sample;

public class Sample_Pgm {

	private void company() { // sign part

		System.out.print("Greens"); // imp part
		System.out.println("tech"); // imp part

	}

	public void course() { // sign part

		System.out.println("java"); // imp part

	}

	protected void version() { // sign part

		System.out.println(1.8F); // imp part

	}

	public void year() { // sign part

		System.out.println(1995); // imp part

	}

	public static void main(String[] args) { // main method sign

		Sample_Pgm s = new Sample_Pgm(); // object syntax
		s.company();// method calling
		s.course();
		s.version();
		s.year();

	}

}
