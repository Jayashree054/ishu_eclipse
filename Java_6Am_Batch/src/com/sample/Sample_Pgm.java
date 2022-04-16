package com.sample;

public class Sample_Pgm {

	private void name_Ofthecompany() { // sign part

		System.out.println("greens"); // imp part

	}

	public void emp() { // sign part

		System.out.println("ishu"); // imp part

	}

	protected void age() { // sign part

		System.out.println(23); // imp part

	}

	public void salary() { // sign part

		System.out.println(12.4F); // imp part

	}

	public static void main(String[]args) { // singan part main method

		Sample_Pgm s = new Sample_Pgm(); // object syntax
		s.name_Ofthecompany();// method calling
		s.emp();
		s.age();
		s.salary();

	}

}
