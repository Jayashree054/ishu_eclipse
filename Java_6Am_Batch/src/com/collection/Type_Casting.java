package com.collection;

public class Type_Casting {
	public static void main(String[] args) {

		//wide
		int a = 10;//4 byte
		double d = a;//8 byte
		System.out.println(d);
		
		//narrow
		
		double s = 23.5;// 8 byte
		int n = (int) s;//4 byte
		System.out.println(n);

	}
}
