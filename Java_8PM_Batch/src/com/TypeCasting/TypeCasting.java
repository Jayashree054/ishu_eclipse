package com.TypeCasting;

public class TypeCasting {

	public static void main(String[] args) {

		// wideing
		int a = 10; // 4 byte

		double l = a; // 8 byte

		System.out.println(l);

		//narrowing
		
		double d= 45.999; //8 byte
		
		int i = (int) d; //4 byte  //downcasting
		
		System.out.println(i);
		
		
	}
}
