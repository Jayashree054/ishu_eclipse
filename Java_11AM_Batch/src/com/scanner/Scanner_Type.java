package com.scanner;

import java.util.Scanner;

public class Scanner_Type {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");

		String Company_name = s.nextLine();
		System.out.println("Company_Name : " + Company_name);

		String emp_name = s.next();
		System.out.println("emp_name : " + emp_name);

		int age = s.nextInt();
		System.out.println("Age : " + age);

		String email = s.next();
		System.out.println("Email: : " + email);

		long phone_no = s.nextLong();
		System.out.println("Phone_no : " + phone_no);

		float salary = s.nextFloat();
		System.out.println("Salary : " + salary);
		s.close();
		
		
	}
}
