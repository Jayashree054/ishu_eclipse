package com.scanner;

import java.util.Scanner;

public class Scanner_Type {

	public static void main(String[] args) {
		System.out.println("enter the value");
		Scanner s = new Scanner(System.in);

		// ctrl+2,l

		String type = s.nextLine();
		System.out.println("Company name: " + type);

		String email = s.next();
		System.out.println("mailid: " + email);

		int years = s.nextInt();
		System.out.println("Years : " + years);

		float turnover = s.nextFloat();
		System.out.println("Turnover: " + turnover);
	}

}
