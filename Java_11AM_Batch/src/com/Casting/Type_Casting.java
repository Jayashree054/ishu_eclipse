package com.Casting;

public class Type_Casting {

	
	public static void main(String[] args) {
		
		
		//wide (low to high)
		int a =10; //4 byte
		double d= a; //8 byte
		
		System.out.println(d);
		
		
		//narrow(high to low)
		
		double g = 10.23; //8byte
		int i= (int) g; // 4 byte // downcasting
		System.out.println(i);
		
		
	}
}
