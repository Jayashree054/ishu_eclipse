package com.demo;

public class Switch_case {

	public static void main(String[] args) {

		String a = "wed";
		int month = 4;
		switch (a) {
		case "mon":
			System.out.println("Jan");
			break;
		case "wed":
			System.out.println("feb");
			break;
		case "thur":
			System.out.println("march");
			break;
		
		default:
			System.out.println("invalid");
			break;
		}

	}

}
