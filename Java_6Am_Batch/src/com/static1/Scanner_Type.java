package com.static1;

import java.util.Scanner;

public class Scanner_Type {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String company = s.nextLine();
		System.out.println("company : " + company);

		String email = s.next();
		System.out.println("email : " + email);

		int age = s.nextInt();
		System.out.println("age : " + age);

		float nextFloat = s.nextFloat();
		System.out.println("nextFloat : " + nextFloat);

		s.close();
		
	}
}
