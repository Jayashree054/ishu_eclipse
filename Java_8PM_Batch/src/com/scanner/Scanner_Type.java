package com.scanner;

import java.util.Scanner;

public class Scanner_Type {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the value");

		String name = s.nextLine();
		System.out.println("nextLine : " + name);

		String next = s.next();
		System.out.println("name : " + next);

		String type = s.nextLine();
		System.out.println("nextLine : " + type);

		int age = s.nextInt();
		System.out.println("age" + age);

		float salary = s.nextFloat();
		System.out.println("salary : " + salary);

		double version = s.nextDouble();
		System.out.println("version : " + version);

	}
}
