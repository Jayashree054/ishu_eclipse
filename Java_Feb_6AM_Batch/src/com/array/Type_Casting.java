package com.array;

public class Type_Casting {
	
	
	public static void main(String[] args) {
		
		
		int a = 10; //4byte
		
		double l = a; //8 byte
		
		System.out.println(l);
		//enum and enumerator
		
		
		double d = 10.56; // 8 byte
		int s=(int) d;  //4 byte (downcasting)
		System.out.println(s);
		
	}

}
