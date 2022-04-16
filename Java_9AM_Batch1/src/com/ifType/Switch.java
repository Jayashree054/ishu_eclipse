package com.ifType;

public class Switch {

	public static void main(String[] args) {

		int month = 4;
		// data type key = value

		switch (month) {

		case 1:
			System.out.println("Condition 1");
			break;
		case 2:
			System.out.println("Condition 2");
			break;
		case 3:
			System.out.println("Condition 3");
			break;
		case 4:
			System.out.println("Condition 4");
			break;
		default:
			System.out.println("invalid input");
			break;
		}

	}

}
