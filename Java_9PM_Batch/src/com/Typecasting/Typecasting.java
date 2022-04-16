package com.Typecasting;

public class Typecasting {

	
	
	public static void main(String[] args) {
		
		//weding
		
		int a=10; //4 byte
		double l = a; // 8byte
		
		System.out.println(l);
		
		//narrowing
		
		double d =23.67; // 8 byte
		int i = (int) d; // 4 byte 
		System.out.println(i);
	}
}
