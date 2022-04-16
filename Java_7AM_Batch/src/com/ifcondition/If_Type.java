package com.ifcondition;

public class If_Type {

	public static void main(String[] args) {

		int a = 10;

		if (a < 5) {
			System.out.println("condition true");
		
		} else if (a < 6) {
			System.out.println("else if condtion true");
		}

		else {
			System.out.println("condition false");
		}

		/*
		 * if (a < 5) {
		 * 
		 * System.out.println("condition true");
		 * 
		 * } else { System.out.println("Condition false"); }
		 * 
		 * 
		 * int i = 10; if (i < 5) { System.out.println("condition 1");
		 * 
		 * if (i > 6) { System.out.println("condition 2"); } else {
		 * System.out.println("invalid input 1 "); } }
		 * 
		 * else { System.out.println("invalid input 2"); }
		 * 
		 * 
		 * int m = 50;
		 * 
		 * // m=mark
		 * 
		 * if (m < 20) {
		 * 
		 * System.out.println("Condtion true"); } //fail
		 * 
		 * else if (m < 40 && m > 60) {
		 * 
		 * System.out.println("average");
		 * 
		 * }//fail
		 * 
		 * else if (m > 60 || m > 40) { System.out.println("fail");
		 * 
		 * } else { System.out.println("input fail"); }
		 */

	}

}
