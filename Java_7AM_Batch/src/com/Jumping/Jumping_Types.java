package com.Jumping;

public class Jumping_Types {

	private int type1() {

		return 23;
	}

	public static void main(String[] args) {

		Jumping_Types j = new Jumping_Types();
		System.out.println(j.type1());

		for (int i = 0; i < 10; i++) {

			if (i == 5)
				break;
			System.out.println(i);

		}
System.out.println("*******************************");
		
		for (int i = 0; i < 10; i++) {

			if (i == 5)
				continue;
			System.out.println(i);

		}

		
		
		
	}

	/*
	 * private int return_Type() {
	 * 
	 * return 5; }
	 * 
	 * public static void main(String[] args) { Jumping_Types j = new
	 * Jumping_Types(); System.out.println("Return Type : " + j.return_Type());
	 * 
	 * for (int i = 0; i <= 10; i++) {
	 * 
	 * if (i == 5) break;
	 * 
	 * System.out.println(i);
	 * 
	 * } System.out.println("***********************************");
	 * 
	 * for (int i = 0; i <= 10; i++) { if (i == 5) continue;
	 * 
	 * System.out.println(i);
	 * 
	 * } }
	 */

}
