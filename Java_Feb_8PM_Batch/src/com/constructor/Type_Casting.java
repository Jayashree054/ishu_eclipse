package com.constructor;

public class Type_Casting {
	public static void main(String[] args) {

		int a = 10; // 4 byte
		double d = a; // 8 byte
		System.out.println(d);

		double s = 24.5; //8 byte
		int g = (int) s; //4 byte //downcasting
		System.out.println(g);

	}

}
