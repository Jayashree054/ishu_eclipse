package com.sample;

public class Sample_PGm {

	
	private void name_Ofthecompany() { // sign part
		System.out.print("java");// imp part
		System.out.println("greens");// imp part

	}

	public void name() { // sign part

		System.out.println("ishu");// imp part

	}

	protected void age() { // sign part

		System.out.println(23);// imp part

	}
	public static void main(String[] args) { // main method sign part

		Sample_PGm s = new Sample_PGm();// object syntax
		s.name_Ofthecompany();// method calling
		s.name();
		s.age();
	}

}
