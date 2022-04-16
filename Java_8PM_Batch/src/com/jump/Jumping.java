package com.jump;

public class Jumping {

	private int online() {

		return 56;

	}
	public static void main(String[] args) {

		Jumping j = new Jumping();
		System.out.println(j.online());

		System.out.println("***************************");

		for (int i = 0; i < 10; i++) {

			if (i == 5)
				break;
			System.out.println(i);
		}
		System.out.println("***************************");
		for (int i = 0; i < 10; i++) {

			if (i == 5)
				continue;
			System.out.println(i);
		}

	}
}
