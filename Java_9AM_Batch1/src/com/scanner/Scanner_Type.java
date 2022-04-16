package com.scanner;

import java.util.Scanner;

public class Scanner_Type {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		String nextLine = s.nextLine();
		System.out.println(nextLine);
	
		String nextLine1 = s.next();
		System.out.println(nextLine1);
		
		int nextLine2 = s.nextInt();
		System.out.println(nextLine2);
		
		float nextLine3 = s.nextFloat();
		System.out.println(nextLine3);
		
	}

}
