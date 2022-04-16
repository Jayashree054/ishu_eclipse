package com.Sample;

public class Sample_Pgm {
	
	private void name_OfCompany() { //sign part
	
		System.out.println("greens"); //imp part
		
	}
	public void emp() { //sign part
		
		System.out.println("ishu");
		
	}
	protected void age() { //sign part
		
		System.out.println(23);
		
	}
	public void salary() { //sign part
		
		System.out.println(12.3F);
		
	}
	public static void main(String[] args) { //sign part
		
		Sample_Pgm s = new Sample_Pgm(); //object syntax
		s.name_OfCompany();//method calling
		s.age();
		s.emp();
		s.salary();
		
		
	}
	
}
