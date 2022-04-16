package com.Program1;

public class Exp {
	public static void main(String[] args) {

		int a = 10;
		
	/*	try {
			System.out.println(a / 0);
		} finally {
			System.out.println("invalid input");
		}*/
		
		
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}

	}

}
