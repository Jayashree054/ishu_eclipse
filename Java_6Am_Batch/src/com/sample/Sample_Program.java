package com.sample;

public class Sample_Program {

	private void name_Ofthecompany() { // sign part

		System.out.println("Greens"); // imp part
	}

	public void logo() { // sign part

		System.out.println("Ishu"); // imp part
	}

	protected void age() { // sign part

		System.out.println(23); // imp part
	}

	public void salary() { // sign part

		System.out.println(21.4F); // imp part
	}

	public static void main(String[] args) { // main method sign

		Sample_Program s = new Sample_Program();// object syntax

		s.name_Ofthecompany();// method calling
		s.logo();
		s.age();
		s.salary();
		
	}

}
