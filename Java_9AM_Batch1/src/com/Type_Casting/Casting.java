package com.Type_Casting;

public class Casting {

	public static void main(String[] args) {
		
		//wide
		int i= 2;
		double l = (double)i; // downcasting
		System.out.println(l);
		
		//narrow
		
		double d = 23.567;
		int a = (int) d; 
		System.out.println(a);
		
	}
}
