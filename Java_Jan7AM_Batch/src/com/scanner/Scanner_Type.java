package com.scanner;

import java.util.Scanner;

public class Scanner_Type {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// System.in----> to give the input value in console
		// System.out--->o/p console

		// ctrl+2,L
		System.out.println("enter the value");
		
		String company = s.nextLine();
		System.out.println("Company name : " + company);

		String next = s.next();
		System.out.println("next: " + next);

		int age = s.nextInt();
		System.out.println(age);

		float nextFloat = s.nextFloat();
		System.out.println("nextFloat : " + nextFloat);
		
		s.close();


	}
}
