package com.iftype;

public class If_Type {

	public static void main(String[] args) {

		int a = 15;

		
		 if (a < 10) { System.out.println("condition true"); } else {
		 System.out.println("invalid input"); }
		System.out.println("****************************************");
		 
		 if (a < 10) {
		 
		 System.out.println("condition1 true");
		 
		 if (a > 10) { System.out.println("condition2 true"); } else {
		 System.out.println("invalid input"); }
		 
		 } else { System.out.println("invalid input2"); }
		

		if (a < 10) {
			System.out.println("condition 1 true");
		} else if (a < 8) {
			System.out.println("Condition 2 true");
		} else if (a < 6) {
			System.out.println("Condition 3 true");
		} else if (a < 8) {
			System.out.println("Condition 4 true");
		} else {
			System.out.println("invalid output");
		}

	}
}
