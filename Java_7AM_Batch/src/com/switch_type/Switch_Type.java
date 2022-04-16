package com.switch_type;

public class Switch_Type {

	public static void main(String[] args) {

		int month = 4;

		switch (month) {

		case 2:
			System.out.println("condition2");

			break;
		case 1:
			System.out.println("condition3");
		case 4:
			System.out.println("condition1");
			break;
		case 3:
			System.out.println("condition4");
			
		default:
			System.out.println("invalid");
		}
	}
}
