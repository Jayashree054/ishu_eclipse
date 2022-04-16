package com.scanner;

import java.util.Scanner;

public class Scanner_Method {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the value");

		String nextLine = s.nextLine();
		System.out.println("" + nextLine);

		String nextLine1 = s.nextLine();
		System.out.println(nextLine1);

		int nextint = s.nextInt();
		System.out.println("Age : " + nextint);

		float salary = s.nextFloat();
		System.out.println("salary : " + salary);

		s.close();
		
	}

}
