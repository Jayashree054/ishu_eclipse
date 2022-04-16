package com.scanner;

import java.util.Scanner;

public final class Scanner_Type {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String company = s.nextLine();
		System.out.println("company :"+company);
		
		String name = s.next();
		System.out.println("emp name : "+ name);
			
		int age = s.nextInt();
		System.out.println("emp age : "+age);
		
		float salary = s.nextFloat();
		System.out.println("salary : "+salary);
		
		long ph_non = s.nextLong();
		System.out.println("phone number : "+ph_non);
		
		s.close();
		
		
	}
	
}
