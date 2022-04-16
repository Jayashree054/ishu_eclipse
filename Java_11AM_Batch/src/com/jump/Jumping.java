package com.jump;

public class Jumping {

	private String online() {

		return "fa";
	}

	public static void main(String[] args) {

		Jumping j = new Jumping();

		System.out.println(j.online());

		System.out.println("****************************");

		for (int i = 0; i < 10; i++) {

			if (i == 5) // condition check
				break;
			System.out.println(i);
			
		}
		System.out.println("****************************");

		for (int i = 0; i < 10; i++) {

			if (i == 5) // condition check
				continue; //skip
			System.out.println(i);

			
		}

	}

}
