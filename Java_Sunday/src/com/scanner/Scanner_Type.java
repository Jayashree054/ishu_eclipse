package com.scanner;

import java.util.Scanner;

public class Scanner_Type {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter the value ");
		String Company = s.nextLine();
		System.out.println("nextLine : " + Company);

		String email = s.next();
		System.out.println("next :" + email);

		int age = s.nextInt();
		System.out.println("Age : " + age);

		long Phone_num = s.nextLong();
		System.out.println("Phone_num :" + Phone_num);

		float Salary = s.nextFloat();
		System.out.println("Salary : " + Salary);

		s.close();
		
	}
}
