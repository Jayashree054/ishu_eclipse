package com.sample;

public class Sample_Pgm {

	private void company() { // Sign part

		System.out.println("company name");
		System.out.println("greens@gmail.com");// imp part

	}

	public void logo() { // Sign part

		System.out.println("Java");

	}

	protected void pgm() { // Sign part

		System.out.println("core java");

	}

	public void version() { // Sign part

		System.out.println(1.8F);

	}

	public static void main(String[] args) {
		Sample_Pgm s = new Sample_Pgm();

	
		
		s.logo();
		s.pgm();
		s.version();
		s.company();
		
	}

}
