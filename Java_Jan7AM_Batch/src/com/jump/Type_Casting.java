package com.jump;

public class Type_Casting {
	public static void main(String[] args) {
		// wide
		int a = 10;// 4 byte
		double d = a; // 8 byte
		System.out.println(d);
		System.out.println("*************");
		// narrow
		double s = 23.4;// 8byte
		int k = (int) s; // 4 byte
		System.out.println(k);

	}
}
