package com.sample;

public class Sample_Pgm {

	private void company() { // sign part

		System.out.println("greens"); // imp part
	}

	public void course() { // sign part

		System.out.println("java"); // imp part
	}

	protected void version() { // sign part

		System.out.println(1.8F); // imp part
	}

	public void years() { // sign part

		System.out.println(2000); // imp part
	}

	public static void main(String[] args) { // main method

		Sample_Pgm s = new Sample_Pgm(); // object syntax

		s.company();// method calling
		s.course();
		s.version();
		s.years();

	}
}
