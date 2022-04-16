package com.sample;

public class Sample_Pgm {

	private void name() { // sign part
		System.out.println("greens");
		System.out.println("Tech");// imp part

	}
	public void course() { // sign part
		System.out.println("java");// imp part

	}
	protected void version() { // sign part
		System.out.println(1.8F);// imp part

	}
	public void batch() { // sign part
		System.out.println(9);// imp part

	}
	public static void main(String[] args) { // main method sign part

		Sample_Pgm s = new Sample_Pgm(); // object syntax
		s.name(); // method calling
		s.course();
		s.version();
		s.batch();

	}
}
