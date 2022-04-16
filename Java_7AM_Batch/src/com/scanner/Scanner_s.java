package com.scanner;

import java.util.Scanner;

public class Scanner_s {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the name");
		String change = s.nextLine();
		System.out.println("company_name :" + change);
		String name1 = s.nextLine();
		System.out.println("company_name :" + name1);
		String nextLine = s.nextLine();
		System.out.println(nextLine);
		// int age = s.nextInt();
		// System.out.println("age :" + age);
		// double salary = s.nextDouble();
		// System.out.println("salary :" + salary);
		
		
		String nextLine2 = s.nextLine();
		System.out.println(nextLine2);
		
		
		
		
		s.close();

	}

}
